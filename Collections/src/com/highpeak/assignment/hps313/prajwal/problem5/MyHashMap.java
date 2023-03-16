package com.highpeak.assignment.hps313.prajwal.problem5;

public class MyHashMap<K, V> {

    private int capacity = 8;
    private Entry<K, V>[] table;

    public MyHashMap(){
        table = new Entry[capacity];
    }

    public MyHashMap(int capacity){
        this.capacity = capacity;
        table = new Entry[capacity];
    }

    private int index(K key){
        if(key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value){
        int index = index(key);
        Entry newEntry = new Entry(key, value, null);
        if(table[index] == null){
            table[index] = newEntry;
        }else {
            Entry<K, V> previousNode = null;
            Entry<K, V> currentNode = table[index];
            while(currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null) {
                previousNode.setNext(newEntry);
            }
        }
    }


    public V get(K key){
        V value = null;
        int index = index(key);
        Entry<K, V> entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key){
        int index = index(key);
        Entry previous = null;
        Entry entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)){
                if(previous == null){
                    entry = entry.getNext();
                    table[index] = entry;
                    return;
                }else {
                    previous.setNext(entry.getNext());
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }
    }

    public void display(){
        for(int i = 0; i < capacity; i++){
            if(table[i] != null){
                Entry<K, V> currentNode = table[i];
                while (currentNode != null){
                    System.out.println(String.format("Key is "+currentNode.getKey()+" and value is %s"+ currentNode.getValue()));
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

}

