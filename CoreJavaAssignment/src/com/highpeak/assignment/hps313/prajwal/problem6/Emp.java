package com.highpeak.assignment.hps313.prajwal.problem6;

public class Emp {
   int empId;
    String empName;
    String designation	;
    double basic;
    double hra;

    public Emp(int empId, String empName, String designation, double basic) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
    }
    public void printdetails(){
        System.out.println("Employee Name : "+empName+" ID : "+empId+" Designation : "+designation+" Basic salary : "+basic);
    }
    public void calculateHRA()throws LowSalException {
       if(basic<500){
           throw new LowSalException(" BASIC less than 500 ");
       }else{
            if(designation=="Manager"){
                hra=basic*10/100;
            } else if (designation=="Officer") {
                hra=basic*12/100;
            }else if(designation=="Clerk"){
                hra=basic*5/100;
            }
        }
       System.out.println(hra);
    }
}
