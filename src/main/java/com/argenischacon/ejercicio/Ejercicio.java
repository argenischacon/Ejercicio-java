package com.argenischacon.ejercicio;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {
    
       GenericQueue<String> colaGenerica = new GenericQueue<>();
       
       colaGenerica.enqueue("Hola");
       colaGenerica.enqueue("Mundo");
       colaGenerica.enqueue(":D");
        try {
        System.out.println(colaGenerica.dequeue());
        } catch (NoSuchElementException e) {
            System.out.println("La pila esta vacia");
        }
        
        System.out.println(colaGenerica.getElementos().toString());
       
        System.out.println(colaGenerica.isEmpty());
        
        System.out.println(colaGenerica.size());
        
    }
}
