package com.highpeak.assignment.hps313.prajwal.problem7;

public class TestUserTrail {
    public static void main(String[] args) {
        UserTrail ut=null;
        try{
           ut=new UserTrail(1,10);
        }catch (IllegalValueException e){
            e.printStackTrace();
        }
       System.out.println("Both the values are greater than zero : "+ut.show());
    }
}
