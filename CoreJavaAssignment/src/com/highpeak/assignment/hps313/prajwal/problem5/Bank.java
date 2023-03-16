package com.highpeak.assignment.hps313.prajwal.problem5;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        BankAccount acc = null;
       while(true) {
           System.out.println("Enter the Account Number");
           int accNo = sc.nextInt();
           System.out.println(" Enter the Customer Name");
           String custName = sc.next();
           System.out.println(" Enter the Account Type ,Savings or Current");
           String accType = sc.next();
           boolean accT = true;

           while (accT) {
               if (accType.equals("Savings") || accType.equals("Current")) {
                   accT = false;
               } else {
                   System.out.println("Enter the valid Account type,Savings or Current");
                   accType = sc.next();
               }
           }
           System.out.println("Enter the Account Balance");
           float bal = sc.nextFloat();
           try {
               acc = new BankAccount(accNo, custName, accType, bal);
               break;
           } catch (LowBalance e) {
               e.printStackTrace();
           }
       }
           boolean a=true;
           while (a){
               System.out.println("Enter 1 to get Account Balance");
               System.out.println("Enter 2 to deposit amount to Account");
               System.out.println("Enter 3 to withdraw amount from the Account");
               System.out.println("Enter 4 to exit the account");
               int n=sc.nextInt();
               switch (n){
                   case 1: System.out.println(acc.getCustName()+" account balance is Rs."+acc.getBalance());
                   break;
                   case 2:System.out.println("Enter the amount to be deposited");
                   float amt=sc.nextFloat();
                  try{
                      acc.deposit(amt);
                  }catch(NegativeAmount e){
                      e.printStackTrace();
                  }break;
                   case 3:System.out.println(" Enter the amount to be withdrawn");
                   amt=sc.nextFloat();
                   try{
                       acc.withdraw(amt);
                   }catch (NegativeAmount e){
                       e.printStackTrace();
                   }catch (InsufficientFunds e){
                       e.printStackTrace();
                   }break;
                   case 4:a=false;
                   break;
                   default:System.out.println("Enter the valid options");
               }
           }
       }

}
