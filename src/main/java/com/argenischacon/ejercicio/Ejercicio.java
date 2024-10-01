package com.argenischacon.ejercicio;

import java.util.ArrayList;
import java.util.Date;

/*
Imagina que tienes un sistema de reparto de pedidos en el cual los vehículos 
(bicicleta, motocicleta, automóvil) entregan diferentes tipos de pedidos, 
y cada vehículo tiene diferentes comportamientos en función del tipo de terreno 
donde realiza la entrega.
 */
public class Ejercicio {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Bicicleta("Rx", "500", new Date(2024 - 1900, 10, 1), true));
        vehiculos.add(new Motocicleta("Bera", "500", new Date(2024-1900, 10, 1)));
        vehiculos.add(new Automovil("Hyundai", "300x", new Date(2024-1900, 10, 1)));
        
        for(Vehiculo vehi: vehiculos){
            vehi.entregarPedido(Terreno.CAMPO);
        }
    
        

    }
}
