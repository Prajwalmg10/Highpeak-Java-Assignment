package com.highpeak.assignment.hps313.prajwal.problem4;

public class Number {
    int a;
    int b;
    double result;
    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double add(){
        result=a+b;
        return result;
    }
    public double subtract(){
        result=a-b;
        return result;
    }
    public double multiply(){
       result=a*b;
       return result;
    }
    public double divide(){
        if(b==0){
            throw new ArithmeticException("division by zero is undefined");
        }else {
            result=a/b;
        }
        return result;
    }
}
