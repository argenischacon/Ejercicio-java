
package com.argenischacon.ejercicio;

import java.util.Date;


public abstract class Vehiculo implements IRepartidor{
    
    protected String marca;
    protected String modelo;
    protected Date year;

    public Vehiculo(String marca, String modelo, Date year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     
}
