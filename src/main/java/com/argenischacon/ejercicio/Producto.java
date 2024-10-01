
package com.argenischacon.ejercicio;


public abstract class Producto<T> {
    //Atributos basicos para un producto
    protected double precio;
    protected  String codigo;
    protected  int cantidad;
    protected T detalle;
    
    //Constructor para inicializar los atributos basicos
    public Producto(double precio, String codigo, int cantidad) {
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }
    
    //Metodo abstracto
    public abstract void mostrarDetalle();
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public T getDetalle() {
        return detalle;
    }

    public void setDetalle(T detalle) {
        this.detalle = detalle;
    }
    
    
    
    
    
}
