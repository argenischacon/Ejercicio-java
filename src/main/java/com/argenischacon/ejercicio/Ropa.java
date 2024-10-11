package com.argenischacon.ejercicio;

public class Ropa extends Articulo<Integer> {

    public Ropa(String nombre, double precioBase, int talla) {
        super(nombre, precioBase);
        this.infoAdicional = talla;
    }

    @Override
    public double calcularPrecio() {
        //El precio se incrementa un 10% por ser ropa
        return precioBase + (precioBase * 0.10);
    }

    @Override
    public String getDescripcion() {
        return "Articulo Ropa{ nombre: " + this.nombre + ", precioBase: " + this.precioBase
                + ", precioFinal: " + calcularPrecio() + ", talla: " + this.infoAdicional+"}";
    }

}
