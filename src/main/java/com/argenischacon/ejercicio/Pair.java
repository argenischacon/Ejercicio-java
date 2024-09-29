
package com.argenischacon.ejercicio;


public class Pair implements Classifiable<Integer> {

    static final int par = 0;
    static final int impar = 1;
    
    @Override
    public int classify(Integer element) {
        if(element%2==0){
            return par;
        }else{
            return impar;
        }
    }
    
}
