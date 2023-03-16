package com.highpeak.assignment.hps313.prajwal.problem6;

public class LowSalException extends  Exception{
    String msg;
    public LowSalException(String msg){
        this.msg=msg;
    }

    @Override
    public void printStackTrace() {
        System.out.println(msg);
    }
}
