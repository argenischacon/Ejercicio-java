package com.argenischacon.ejercicio;

import java.util.ArrayList;

public class Tienda {

    private static ArrayList<Producto> productosDisponibles;

    public Tienda() {
        productosDisponibles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productosDisponibles.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        if (productosDisponibles.isEmpty()) {
            System.out.println("No hay productos disponibles para eliminar");
        } else {
            if (productosDisponibles.contains(producto)) {
                productosDisponibles.remove(producto);
            } else {
                System.out.println("El producto no existe en la tienda");
            }
        }
    }

    public void mostrarProductosDisponibles() {
        if (productosDisponibles.isEmpty()) {
            System.out.println("No hay productos disponibles en la tienda.");
        } else {
            for (Producto p : productosDisponibles) {
                System.out.println(p);

            }
        }
    }        
}