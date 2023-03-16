package com.highpeak.assignment.hps313.prajwal.problem7;

public class IllegalValueException extends Exception {
    String msg;
    public IllegalValueException(String msg){
        this.msg=msg;
    }

    public void printStackTrace() {
        System.out.println(msg);
    }
}
