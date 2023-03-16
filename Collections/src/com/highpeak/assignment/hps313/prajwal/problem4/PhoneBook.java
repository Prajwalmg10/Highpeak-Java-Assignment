package com.highpeak.assignment.hps313.prajwal.problem4;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Long> bookEntry=new HashMap<>();
        bookEntry.put("Peter",9876543212l);
        bookEntry.put("Smith",7890654321l);
        bookEntry.put("Tony",9807366317l);
        bookEntry.put("Stark",9872343212l);
        while(true){
            System.out.println("Enter 1 to add new phone book entry");
            System.out.println("Enter 2 to search phone no");
            System.out.println("Enter 3 to Quit ");
            int opt=sc.nextInt();
            switch (opt){
                case 1:System.out.println("Enter the name and phone number for new entry");
                String name=sc.next();
                long phoneNo=sc.nextLong();
                bookEntry.put(name,phoneNo);
                System.out.println("New entry is added to the phone book successfully");
                break;

                case 2:System.out.println("Enter the person name");
                        name=sc.next();
                        if(bookEntry.containsKey(name)){
                            System.out.println(name+" phone number is "+bookEntry.get(name));
                        }else{
                            System.out.println("Name not found");
                        }
                break;
                case 3:System.exit(0);
                break;
                default:System.out.println("Select valid option");
            }

        }
    }
}
