package com.highpeak.assignment.hps313.prajwal.problem7;

public class UserTrail {
    int val1;
    int val2;

    public UserTrail(int val1, int val2) throws IllegalValueException {
       if(val1<0||val2<0){
           throw new IllegalValueException("Value is less than zero");
       }else{
           this.val1 = val1;
           this.val2 = val2;
       }
    }
    public boolean show(){
        if(val1>0&&val2>0){
            return true;
        }
        return false;
    }
}
