
package com.argenischacon.ejercicio;


public class Coche extends Vehiculo<String> {

    public Coche(String marca, String modelo, int year, String tipoCombustible) {
        super(marca, modelo, year);
        this.detalle = tipoCombustible;
    }

    @Override
    protected void mostrarDetalle() {
        System.out.println("Detalle: "+this.detalle);
    }
    
    
}
