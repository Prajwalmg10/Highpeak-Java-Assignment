package com.highpeak.assignment.hps313.prajwal.problem5;

public class BankAccount  {
   private int accNo;
     private String custName;
    private String accType;
   private float balance;
    public BankAccount(int accNo, String custName, String accType, float balance) throws LowBalance {
        if((accType.equals("Savings") && balance>1000)||(accType.equals("Current") && balance>5000)) {
            this.accNo = accNo;
            this.custName = custName;
            this.accType = accType;
            this.balance = balance;
        }else{
            throw new LowBalance("Account balance lower than minimum balance");
        }
    }
    void deposit(float amt) throws NegativeAmount{
      if(amt<0){
              throw new NegativeAmount("Enter The valid amount to deposit");
      }else{
          setBalance(getBalance()+amt);
          System.out.println("Deposited Successfully");
      }
    }
    void withdraw (float amt) throws InsufficientFunds,NegativeAmount{
        if(amt<0){
            throw new NegativeAmount("Enter The valid amount to withdraw");
        }else{
            if(accType.equals("Savings")){
                if(amt>getBalance()){
                    throw new InsufficientFunds("Insufficient balance in account");
                } else if (getBalance()-amt<1000) {
                    System.out.println("Balance in Savings account should minimum 1000");
                }else{
                    setBalance(getBalance()-amt);
                    System.out.println("Withdrawn Successfully");
                }
            }
            else{
                if(amt>balance){
                    throw new InsufficientFunds("Insufficient Balance in Account ");
                } else if (balance-amt<5000) {
                    System.out.println("Balance in Current account should minimum 5000");
                }else{
                    balance=balance-amt;
                    System.out.println("Withdrawn Successfully");
                }
            }
        }

    }
    public float getBalance() {
        try{
            if((accType=="Savings" && balance<1000)||(accType=="Current" && balance<5000)) {
                throw new LowBalance("Account balance lower than minimum balance");
            }
            return balance;
        }
        catch (LowBalance e){
           e.printStackTrace();
        }
        return balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
