package com.yash.bank4;

public class Main

{

public static void main(String[] args)

{

    Bank A = new BankSbi();

    A.getBalance();

    Bank B= new BankHdfc();

    B.getBalance();

    Bank C = new BankKotak();

    C.getBalance();

}

}
