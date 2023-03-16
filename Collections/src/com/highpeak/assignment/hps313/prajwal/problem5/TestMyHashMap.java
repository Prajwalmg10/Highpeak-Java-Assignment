package com.highpeak.assignment.hps313.prajwal.problem5;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap<Integer,String> hm=new MyHashMap<>();
        hm.put(101,"Tony");
        hm.put(102,"Stark");
        hm.put(201,"Steve");

        System.out.println(hm.get(101));

    }
}
