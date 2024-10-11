
package com.argenischacon.ejercicio;


public abstract class Articulo<T> implements Producto{
    //Atributos comunes
    protected String nombre;
    protected double precioBase;
    protected T infoAdicional;

    public Articulo(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    
    //Metodos comunes

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public T getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(T infoAdicional) {
        this.infoAdicional = infoAdicional;
    }
     
}
