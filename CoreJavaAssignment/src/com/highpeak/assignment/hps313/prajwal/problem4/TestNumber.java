package com.highpeak.assignment.hps313.prajwal.problem4;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Number num;
        while(true){
            System.out.println("Enter two Numbers");
            num=new Number(sc.nextInt(),sc.nextInt());
            System.out.println("Enter 1 to perform addition");
            System.out.println("Enter 2 to perform subtraction");
            System.out.println("Enter 3 to perform Multiplication");
            System.out.println("Enter 4 to perform Division");
            System.out.println("Enter 5 to Exit");
            int opt=sc.nextInt();
            switch (opt){
                case 1:num.add();
                System.out.println("Sum of two numbers is "+num.result);
                break;
                case 2:num.subtract();
                    System.out.println("Difference of two numbers is "+num.result);
                    break;
                case 3:num.multiply();
                    System.out.println("Product  of two numbers is "+num.result);
                    break;
                case 4:try{
                    num.divide();
                }catch(ArithmeticException e){
                    e.printStackTrace();
                }
                    System.out.println("Result of two numbers is "+num.result);
                    break;

            }
        }
    }
}
