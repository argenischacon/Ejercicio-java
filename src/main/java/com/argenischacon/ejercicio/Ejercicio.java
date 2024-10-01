package com.argenischacon.ejercicio;

import java.util.Date;

public class Ejercicio {

    public static void main(String[] args) {

        Inventario electronicos = new Inventario();
        electronicos.agregarProducto(new Electronico(299.99, "E123", 10, "Procesador Intel i5, 16GB RAM"));
        electronicos.agregarProducto(new Electronico(199.99, "E124", 5, "Procesador AMD Ryzen 5, 8GB RAM"));

        Inventario alimentos = new Inventario();
        alimentos.agregarProducto(new Alimento(2.99, "A321", 50, new Date(2024 - 1900, 12, 01)));
        alimentos.agregarProducto(new Alimento(1.99, "A322", 30, new Date(2024 - 1900, 10, 15)));

        System.out.println("Inventario de electronicos: ");
        electronicos.mostrarInventario();
        System.out.println("\nInventario de Alimentos: ");
        alimentos.mostrarInventario();

    }
}
