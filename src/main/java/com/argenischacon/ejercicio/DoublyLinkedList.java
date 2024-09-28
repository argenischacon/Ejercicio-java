package com.argenischacon.ejercicio;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {

    //Clase interna
    private class Node<T> {

        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    //Atributos de DoublyLinkedList
    private Node<T> head;
    private Node<T> tail;
    private int size;

    //Constructor
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    //Añadir elemento al comienzo
    void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //Añadir elemento al final
    void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //Eliminar y devolver el primer elemento
    T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("La lista esta vacia");
        }
        T item = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return item;
    }

    //Eliminar y devolver el ultimo elemento
    T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("La lista esta vacia");
        }
        T item = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        return item;
    }

    //Obtener el primer elemento sin eliminarlo
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("La lista esta vacia");
        }

        return head.data;
    }

    //Obtener el ultimo elemento sin eliminarlo
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("La lista esta vacia");
        }

        return tail.data;
    }

    //Verificar si la lista esta vacia
    private boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
}
