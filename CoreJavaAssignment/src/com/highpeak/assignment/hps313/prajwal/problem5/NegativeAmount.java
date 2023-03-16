package com.highpeak.assignment.hps313.prajwal.problem5;

public class NegativeAmount extends Exception{
    String msg;
    public NegativeAmount(String msg) {
        this.msg = msg;
    }

    @Override
    public void printStackTrace() {
        System.out.println(msg);
    }
}
