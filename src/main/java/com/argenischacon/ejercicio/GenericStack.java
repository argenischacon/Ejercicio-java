
package com.argenischacon.ejercicio;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;


public class GenericStack <T> {
    
    private List<T> elementos;

    public GenericStack() {
        elementos = new LinkedList<>();
    }
    
    public void push(T item){
        //añade un elemento a la parte superior de la pila
        elementos.add(item);
    }
    
    public T pop(){
        //Elimina y devuelve el elemento de la parte superior de pila
       if(elementos.isEmpty()){
           throw new EmptyStackException();
       }
        T itemSuperior = elementos.get(elementos.size()-1);
        elementos.remove(elementos.size()-1);
        return itemSuperior;    
    }
    
    public T peek(){
        //Devuelve el elemento en la parte superior de la pila sin eliminarlo
        if(elementos.isEmpty()){
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size()-1);
    }
    
    public boolean isEmpty(){
        //Verificar si la lista esta vacia
        return elementos.isEmpty();
    }
    
    public int size(){
        //Retornar el tamaño de la lista
        return elementos.size();
    }
    
    public List<T> getElementos(){
        return this.elementos;
    }
}
