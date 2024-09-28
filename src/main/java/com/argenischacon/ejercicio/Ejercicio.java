package com.argenischacon.ejercicio;



public class Ejercicio {

    public static void main(String[] args) {
    
        BiDictionary<Integer, String> obj = new BiDictionary<>();
        obj.put(1, "Hola");
        obj.put(2, "mundo");
        obj.put(3, "mundo");
        obj.removeByValue("Hola");
        System.out.println("Contiene el valor?: "+obj.containsValue("mundo"));
        System.out.println("Tamaño: "+obj.size());
        System.out.println(obj.get_key_value().toString());
        System.out.println(obj.get_value_key().toString());
                
        
    }
}
