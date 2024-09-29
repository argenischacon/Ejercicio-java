package com.argenischacon.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Classifier<T> {

    List<T> lista;

    public Classifier() {
        lista = new ArrayList<>();
    }

    public void addElement(T element) {
        lista.add(element);
    }

    public Map<Integer, List<T>> classifyElements(Classifiable<T> classifiable) {
        if (lista.isEmpty()) {
            throw new NoSuchElementException();
        }

        Map<Integer, List<T>> mapa = new HashMap<>();
        for(T item: lista){
            int categoria = classifiable.classify(item);
            
            mapa.putIfAbsent(categoria, new ArrayList<>());
            
            mapa.get(categoria).add(item);
            
        }

        return mapa;
    }

}
