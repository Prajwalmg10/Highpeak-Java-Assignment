package com.highpeak.assignment.hps313.prajwal.problem3;

import java.util.Scanner;

public class CalcAverage {
    public static double avgFirstN(int N) throws IllegalArgumentException{
        int sum=0;
        double avg=0;
        if (N>=1){
            for (int i = 1; i <= N; i++) {
                sum=sum+i;
            }
            avg=sum/N;
        }else{
            throw  new IllegalArgumentException();
        }
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println(avgFirstN(sc.nextInt()));
        }
        catch (IllegalArgumentException e){
            System.out.println("Enter the Natural Numbers only");
        }
    }

}
