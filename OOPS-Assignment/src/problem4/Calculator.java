package problem4;

import java.util.Scanner;

public class Calculator {

    public static void math(int n1,int n2,String operator){
        switch (operator){
            case "+":System.out.println("Sum of two number is "+n1+n2);
                break;
            case "-":System.out.println("Result of two number is "+ (n1-n2));
                break;
            case "*":System.out.println("Product of two number is "+n1*n2);
                break;
            case "/":
                try {
                    int res=n1/n2;
                    System.out.println("Quotient is "+res);
                }catch (ArithmeticException e) {
                    System.out.println("Denominator can not be Zero");
                }
                break;
            case "%":
                try {
                    int res=n1%n2;
                    System.out.println(" Remainder is "+res);
                }catch (ArithmeticException e) {
                    System.out.println("Denominator can not be Zero");
                }
                break;
            default:System.out.println("Invalid Operator");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter two Numbers");
            int n1= sc.nextInt();
            int n2=sc.nextInt();
            System.out.println("Enter the Arithmetic operator");
            String s=sc.next();
            math(n1,n2,s);
        }
    }
}
