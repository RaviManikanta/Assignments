package com.yash.util.ass_inheritance_polymor;

public class SavingsAccount extends Account { 
    private double interest;

    public SavingsAccount(int acctNum, double interest) {
        super(acctNum);
        this.interest=interest;
    }

    public double getInterest() { 
        double x= getBalance() + getBalance()*interest;
        return x;

    // public void setInterest((interest))
    // this.interest=interest;
    }
    public void AddInterest (double interest) { 
        double x = super.getBalance() * interest; 
        super.deposit(x);
    }
    public String toString() {
        return super.toString()+" Interest : " + interest; 
    }
}