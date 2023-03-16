package com.highpeak.assignment.hps313.prajwal.problem5;

public class InsufficientFunds extends Exception{
    String msg;
    public InsufficientFunds(String msg){
        this.msg=msg;
    }

    public void printStackTrace() {
        System.out.println(msg);
    }
}
