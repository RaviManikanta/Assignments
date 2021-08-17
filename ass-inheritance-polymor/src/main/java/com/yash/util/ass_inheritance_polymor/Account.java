package com.yash.util.ass_inheritance_polymor;

public class Account {

    private double balance; 
    private int acctNum; 

    public Account (int num)
    { 
        balance = 0.0;
        acctNum = num; 
    } 
    public void deposit (double amt)
    { 
        if (amt >0)
            balance +=amt;
        else 
            System.out.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");
    }
    public void withdraw (double amt)
    {
        if (amt>0)
            balance -=amt; 
        else 
            System.err.println("Account.withdraw(...): "
                    +"cannot withdraw negative amount.");

    }
    public double getBalance() 
    { 
        return balance; 
    }
    public double getAccountNumber()
    {
        return acctNum;
    }
    public String toString()
    {
      return "Acc " + acctNum + ": " + "balance = "+ balance;   
    }
    public final void print()
    {
           System.out.println( toString()); 
    }

}