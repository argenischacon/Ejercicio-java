package com.argenischacon.ejercicio;

import java.util.ArrayList;


public class Ejercicio {

    public static void main(String[] args) {

    ArrayList<Articulo<?>> articulos = new ArrayList<>();
    
    articulos.add(new Electronico("Consola de videojuegos", 100, "Xbox"));
    articulos.add(new Electronico("Camara", 200, "Nixon"));
    articulos.add(new Ropa("Camisa", 50, 16));
    articulos.add(new Ropa("Pantalon", 23, 32));
    
    
    for(Articulo<?> a: articulos){
        System.out.println(a.getDescripcion());
    }    
        
    }
}
