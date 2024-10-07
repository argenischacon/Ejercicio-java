package com.argenischacon.ejercicio;

import java.util.ArrayList;

public class Cliente implements ICompra {
    //Atributos

    private String nombre;
    private ArrayList<Producto> carritoDeCompras;

    public Cliente(String nombre) {
        this.nombre = nombre;
        carritoDeCompras = new ArrayList<Producto>();
    }

    @Override
    public void realizarCompra() throws StockInsuficienteException {
        if (carritoDeCompras.isEmpty()) {
            System.out.println("No hay productos en el carrito");
        } else {
            for (Producto p : carritoDeCompras) {
                if (p.getStock() <= 0) {
                    throw new StockInsuficienteException("No hay suficiente stock para " + p.getNombre());
                }
                p.setStock(p.getStock() - 1);
                System.out.println("Compra realizada por " + this.nombre + ": " + p.getNombre());
            }
        }
    }

    public void agregarProductoAlCarrito(Producto producto) {
        carritoDeCompras.add(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getCarritoDeCompras() {
        return carritoDeCompras;
    }

    public void setCarritoDeCompras(ArrayList<Producto> carritoDeCompras) {
        this.carritoDeCompras = carritoDeCompras;
    }

}
