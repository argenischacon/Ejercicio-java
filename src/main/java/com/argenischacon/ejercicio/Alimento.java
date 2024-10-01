package com.argenischacon.ejercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends Producto<Date> {

    public Alimento(double precio, String codigo, int cantidad, Date fechaCaducidad) {
        super(precio, codigo, cantidad);
        this.detalle = fechaCaducidad;
    }

    @Override
    public void mostrarDetalle() {
        //mostrar la fecha de caducidad en un formato legible
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha de Caducidad: " + sdf.format(detalle));
    }

}
