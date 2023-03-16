package com.highpeak.assignment.hps313.prajwal.problem6;

public class TestEmp {
    public static void main(String[] args) {
        Emp e1=new Emp(101,"Peter","Manager",3000);
        Emp e2=new Emp(104,"Stark","Officer",4000);
        Emp e3 =new Emp(301,"Smith","Clerk",450);
        e1.printdetails();
        e2.printdetails();
        e3.printdetails();

        try{
            e1.calculateHRA();
            e2.calculateHRA();
            e3.calculateHRA();
        }catch (LowSalException e){
            e.printStackTrace();
        }
    }
}
