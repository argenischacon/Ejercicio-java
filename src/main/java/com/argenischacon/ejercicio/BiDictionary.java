package com.argenischacon.ejercicio;

import java.util.HashMap;
import java.util.Map;

public class BiDictionary<K, V> {

    private Map<K, V> key_value;
    private Map<V, K> value_key;

    public BiDictionary() {
        key_value = new HashMap<>();
        value_key = new HashMap<>();
    }

    void put(K key, V value) {
        // Si ya existe la clave o el valor, elimina las entradas anteriores
        if (key_value.containsKey(key)) {
            V oldValue = key_value.get(key);
            value_key.remove(oldValue);
        }
        if (value_key.containsKey(value)) {
            K oldKey = value_key.get(value);
            key_value.remove(oldKey);
        }
        // Inserta el nuevo par clave-valor
        key_value.put(key, value);
        value_key.put(value, key);
    }

    public V getByKey(K key) {
        return key_value.get(key);
    }

    public K getByValue(V valor) {
        return value_key.get(valor);
    }

    public boolean containsKey(K key) {
        return key_value.containsKey(key);
    }

    public boolean containsValue(V value) {
        return value_key.containsKey(value);
    }

    public void removeByKey(K key) {
        V valor = key_value.get(key);
        key_value.remove(key);
        value_key.remove(valor);
    }

    public void removeByValue(V value) {
        K key = value_key.get(value);
        value_key.remove(value);
        key_value.remove(key);
    }

    public int size() {
        return key_value.size();
    }

    public Map<V, K> get_value_key() {
        return this.value_key;
    }

    public Map<K, V> get_key_value() {
        return this.key_value;
    }

}
