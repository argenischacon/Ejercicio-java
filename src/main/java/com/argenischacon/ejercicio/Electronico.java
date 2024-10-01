package com.argenischacon.ejercicio;

import java.util.Date;

public class Electronico extends Producto<String> {
    
    public Electronico(double precio, String codigo, int cantidad, String especificaciones){
        super(precio, codigo, cantidad);
        this.detalle = especificaciones;
    }

    @Override
    public void mostrarDetalle() {
        //Muestra la descripcion de las especificaciones
        System.out.println(detalle);
    }

    
}
