package com.argenischacon.ejercicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio {

    public static void main(String[] args) {
 
    
        Classifier<Integer> clasificador1 = new Classifier<>();
        clasificador1.addElement(1);
        clasificador1.addElement(2);
        clasificador1.addElement(3);
        clasificador1.addElement(4);
        clasificador1.addElement(5);
        clasificador1.addElement(6);

        System.out.println("---Clasificaciones---\nLista de pares:");
        for(Integer item: clasificador1.classifyElements(new Pair()).get(0)){     
            System.out.print(item+" ");
        }
        
        System.out.println("\nLista de impares: ");
        for(Integer item: clasificador1.classifyElements(new Pair()).get(1)){     
            System.out.print(item+" ");
        }
        
        
        Classifier<String> clasificador2 = new Classifier();
        clasificador2.addElement("Hola");
        clasificador2.addElement("Escuela");
        clasificador2.addElement("Casa");
        clasificador2.addElement("Laberinto");
        
        System.out.println("\n---Clasificaciones--- \nCadenas cortas:");
        for (String item: clasificador2.classifyElements(new Cadena()).get(0)) {
            System.out.print(item+" ");
        }
        System.out.println("\nCadenas largas:");
        for (String item: clasificador2.classifyElements(new Cadena()).get(1)) {
            System.out.print(item+" ");
        }
        System.out.println("");
        
        
        //Clase anonima
        
        Classifier<Integer> clasificador3 = new Classifier<>();
        clasificador3.addElement(-1);//negativo
        clasificador3.addElement(2);//positivo
        clasificador3.addElement(0);//cero
        
        Map<Integer,List<Integer>> mapa = new HashMap<>();
        mapa = clasificador3.classifyElements(new Classifiable<Integer>() {
            @Override
            public int classify(Integer element) {
                if(element<0){
                    return -1;
                }else if(element>0){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        
        System.out.println("---Clasificaciones---");
        System.out.println("Negativos:");
        for (Integer negativos: mapa.get(-1)) {
            System.out.println(negativos);
        }
        System.out.println("Positivos:");
        for (Integer positivos: mapa.get(1)) {
            System.out.println(positivos);
        }
        System.out.println("Ceros:");
        for (Integer ceros: mapa.get(0)) {
            System.out.println(ceros);
        }
        
        
        
        
        
        
        
        
    }
}
