package com.highpeak.assignment.hps313.prajwal.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List studentList=new ArrayList();
        studentList= Arrays.asList("Peter","Smith","Tony","Allen");
        String name="Peter";
     if( studentList.contains(name)){
         System.out.println(name+" is exist in the list");
     }else {
         System.out.println(name+" is not exist in the list");
     }
    }
}
