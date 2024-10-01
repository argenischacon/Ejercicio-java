
package com.argenischacon.ejercicio;


public abstract class Vehiculo<T> {
    //Atributos comunes para los vehiculos
    protected String marca ;
    protected String modelo;
    protected int year;
    protected T detalle;

    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    //metodo abstracto
    protected abstract void mostrarDetalle();
    
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public T getDetalle() {
        return detalle;
    }

    public void setDetalle(T detalle) {
        this.detalle = detalle;
    }

    
    
}
