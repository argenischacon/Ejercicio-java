package com.argenischacon.ejercicio;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Inventario<T extends Producto> {

    ArrayList<T> listaProductos;

    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        listaProductos.add(producto);
    }

    public void eliminarProducto(String codigo) {
        if (listaProductos.isEmpty()) {
            throw new NoSuchElementException();
        }
        for (T producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                listaProductos.remove(producto);
                break;
            }
        }
    }

    public void mostrarInventario() {
        for (T producto : listaProductos) {
            String codigo = producto.getCodigo();
            double precio = producto.getPrecio();
            int cantidad = producto.getCantidad();
            
            System.out.print("Codigo: " + codigo + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Detalle: ");
            producto.mostrarDetalle();
            
        }
    }

}
