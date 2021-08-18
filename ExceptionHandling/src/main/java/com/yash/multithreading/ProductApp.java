package com.yash.multithreading;
import java.lang.Thread;

class Product {
	public int id;
	public String name;
	void list() {
		System.out.println("Id: " +id+ "   Product name : " +name);
	}

	   synchronized void confirmatioOfPayment(){
			System.out.println("payment confirmed for id: "+id);
			list();
	   }

	   synchronized void printRecepit(int id){
			 
			  System.out.println( id+ " Print receipt");
			  list();
	   }
}

class TransactionDeposit implements Runnable{
	int amount;
	Product accountX;
	TransactionDeposit(Product x, int amount){
		accountX = x;
		this.amount = amount;
		new Thread(this).start();
	}
	
	public void run(){
		accountX.confirmatioOfPayment();
	}
}

class TransactionWithdraw implements Runnable{
	int amount;
	Product accountY;
	
	TransactionWithdraw(Product y, int amount) {
		accountY = y;
		this.amount = amount;
		new Thread(this).start();
	}
	
	public void run(){
		accountY.printRecepit(amount);
	}
}

class ProductApp{
	public static void main(String args[]) {
		Product ABC = new Product();
		ABC.id = 1;
		ABC.name = "laptop";
		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1 = new TransactionDeposit(ABC, 500);
		t2 = new TransactionWithdraw(ABC,900);
	}
}
