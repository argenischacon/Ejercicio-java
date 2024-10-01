
package com.argenischacon.ejercicio;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Garaje<T extends Vehiculo> {
    
    ArrayList<T> vehiculos;
    
    public Garaje(){
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(T vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void eliminarVehiculo(String modelo){
        if(vehiculos.isEmpty()){
            throw new NoSuchElementException("Lista Vacia");
        }
        for(T vehi: vehiculos){
            if(vehi.getModelo().equals(modelo)){
                vehiculos.remove(vehi);
            }
        }
    }
    
    public void mostrarVehiculos(){
        for(T vehi: vehiculos){
            System.out.print("Modelo: "+vehi.getModelo()+", Marca: "+vehi.getMarca()+", Year: "+vehi.getYear()+", ");
            vehi.mostrarDetalle();
        }
    }
    
}
