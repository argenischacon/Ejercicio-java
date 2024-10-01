
package com.argenischacon.ejercicio;

public class Moto extends Vehiculo<Integer>{

    public Moto(String marca, String modelo, int year, int cilindrada) {
        super(marca, modelo, year);
        this.detalle = cilindrada;
    }

    
    
    @Override
    protected void mostrarDetalle() {
        System.out.println("Cilindrada: "+this.detalle);
    }
    
}
