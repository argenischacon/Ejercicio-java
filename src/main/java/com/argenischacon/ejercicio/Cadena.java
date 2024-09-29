
package com.argenischacon.ejercicio;


public class Cadena implements Classifiable<String> {
    static final int corta = 0;
    static final int larga = 1;            
    @Override
    public int classify(String element) {
        if(element.length()<5){
            return corta;
        }else{
            return larga;
        }
            
    }
    
}
