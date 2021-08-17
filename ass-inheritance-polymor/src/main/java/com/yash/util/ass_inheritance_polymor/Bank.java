package com.yash.util.ass_inheritance_polymor;

public class Bank {

    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount(2, 0.25);
        accounts[1] = new CheckingAccount(23, 50);

        for(int i=0; i<accounts.length;i++) {
            if (accounts[0].equals(SavingsAccount)
                System.out.println(accounts[0].getInterest());
        }
    }