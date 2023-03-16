package com.highpeak.assignment.hps313.prajwal.problem5;

public class Entry<K, V> {

    private K key;
    private V value;
    private Entry<K, V> next;

    public Entry(K key, V value, Entry<K, V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
}

