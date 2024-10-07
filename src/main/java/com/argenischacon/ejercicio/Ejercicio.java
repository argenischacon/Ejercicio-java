package com.argenischacon.ejercicio;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio {

    public static void main(String[] args) {

        // Crear productos
        Producto producto1 = new Producto("Laptop", 1200.0, 5);
        Producto producto2 = new Producto("Mouse", 25.0, 10);
        Producto producto3 = new Producto("Teclado", 45.0, 0);  // Sin stock para probar la excepción

        // Crear tienda y agregar productos al catálogo
        Tienda tienda = new Tienda();
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        // Crear un cliente
        Cliente cliente1 = new Cliente("Argenis Chacón");

        // Cliente añade productos al carrito de compras
        cliente1.agregarProductoAlCarrito(producto1);
        cliente1.agregarProductoAlCarrito(producto3);  // Intentar añadir producto sin stock

        try {
            // Realizar la compra
            cliente1.realizarCompra();  // Implementa lógica para procesar la compra y lanzar excepciones
        } catch (StockInsuficienteException e) {
            System.out.println("Problemas de stock con un producto");
        }
       

        // Mostrar el estado de los productos luego de la compra
        tienda.mostrarProductosDisponibles();
    


}
}
