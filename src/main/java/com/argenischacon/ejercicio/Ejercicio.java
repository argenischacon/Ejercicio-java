package com.argenischacon.ejercicio;

import java.util.NoSuchElementException;

public class Ejercicio {

    public static void main(String[] args) {
        DoublyLinkedList<String> lista = new DoublyLinkedList<>();
        lista.addFirst("primero");
        lista.addLast("Segundo");
        System.out.println(lista.getFirst());
        lista.removeFirst();
        System.out.println(lista.getFirst());
        lista.clear();
        try {
        System.out.println(lista.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Lista vacia");
        }
        
             
        

    }
}
