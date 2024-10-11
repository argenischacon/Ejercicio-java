package com.argenischacon.ejercicio;

public class Electronico extends Articulo<String> {

    public Electronico(String nombre, double precioBase, String marca) {
        super(nombre, precioBase);
        this.infoAdicional = marca;
    }

    @Override
    public double calcularPrecio() {
        //El precio se incrementa un 15% por ser electronico
        return precioBase + (precioBase * 0.15);
    }

    @Override
    public String getDescripcion() {
        return "Articulo Electronico{ nombre: " + this.nombre + ", precioBase: " + this.precioBase
                + ", precioFinal: " + calcularPrecio() + ", marca: " + this.infoAdicional+" }";
    }

}
