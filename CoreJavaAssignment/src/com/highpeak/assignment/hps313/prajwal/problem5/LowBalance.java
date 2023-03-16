package com.highpeak.assignment.hps313.prajwal.problem5;

public class LowBalance extends Exception {

    String msg;
    public LowBalance(String msg){
        this.msg=msg;
    }

    public void printStackTrace() {
        System.out.println(msg);
    }
}
