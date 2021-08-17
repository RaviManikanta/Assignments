package com.yash.util.ass_inheritance_polymor;

public class CheckingAccount extends Account {
    private double limit; 

    public CheckingAccount(int acctNum, double limit) {
        super(acctNum);
        this.limit=limit;
    }

    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) { 
        this.limit=limit; 
    }
    public void withdraw (double limit) { 
        if (limit <= this.limit)
            super.withdraw(limit);
        else { 
            System.out.println(" Sorry, Limit Exceeded" );
        }

    }


    public String toString() { 
        return super.toString() +"Limit :   "+limit; 
    }
}