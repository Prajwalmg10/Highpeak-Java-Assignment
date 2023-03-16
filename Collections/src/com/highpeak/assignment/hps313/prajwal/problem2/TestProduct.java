package com.highpeak.assignment.hps313.prajwal.problem2;

import java.util.Hashtable;
import java.util.Set;

public class TestProduct {
    public static void main(String[] args) {
        Hashtable<String,String> productList=new Hashtable<>();
        productList.put("P001","Maruti800");
        productList.put("P002","MarutiZen");
        productList.put("P003","MarutiEsteem");
        productList.put("P004","KiaSonet");
        productList.put("P005","TataNexon");

        productList.forEach((k,v)->System.out.println("ProductID :"+k+" ProductValue :"+v));
        Set<String> keys=productList.keySet();
        String keyR="P001";
        keys.forEach(k->{if(k=="P001"){
            productList.remove(k);
            System.out.println("Product "+keyR+" is removed");
        }
        });
        productList.forEach((k,v)->System.out.println("ProductID :"+k+" ProductValue :"+v));
    }
}
