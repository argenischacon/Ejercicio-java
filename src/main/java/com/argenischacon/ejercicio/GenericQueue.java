
package com.argenischacon.ejercicio;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;


public class GenericQueue<T> {

    List<T> elementos;
    
    public GenericQueue() {
        elementos =  new LinkedList<>();
    }
    
    public void enqueue (T item){
        elementos.add(item);
    }
    
    public T dequeue (){
        if(elementos.isEmpty()){
            //Excepcion
            throw new NoSuchElementException();
        }
        T itemFrente = elementos.get(0);
        elementos.remove(0);
        return itemFrente;
    }
    
    public T front(){
        if(elementos.isEmpty()){
            //Excepcion
            throw new NoSuchElementException();
        }
        return elementos.get(0);
    }
    
    public boolean isEmpty(){
        return elementos.isEmpty();
    }
    
    public int size(){
        return elementos.size();
    }
    
    public List<T> getElementos(){
        return this.elementos;
    }
}
