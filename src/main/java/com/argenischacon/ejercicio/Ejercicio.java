package com.argenischacon.ejercicio;

import java.util.EmptyStackException;
import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {
        GenericStack<Integer> pilaGenerica = new GenericStack<>();
        pilaGenerica.push(4);
        pilaGenerica.push(5);
        pilaGenerica.push(6);
        
        System.out.println(pilaGenerica.getElementos().toString());
        
        try {
        System.out.println(pilaGenerica.pop());
        } catch (EmptyStackException e) {
            System.out.println("La pila esta vacia");
        }
        
        System.out.println(pilaGenerica.getElementos().toString());
        
        System.out.println(pilaGenerica.isEmpty());
        
        System.out.println(pilaGenerica.size());
        
       
    }
}
