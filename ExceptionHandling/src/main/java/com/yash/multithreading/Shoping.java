package com.yash.multithreading;
import java.lang.Thread;
/**
 * without synchronization
 * @author USER-PC
 *
 */ 
	 
	 
	 
class GetListOfProducts extends Thread //gp
{
	
	public   void run() {
		synchronized (this) {
	
		  System.out.println("getproduts");
		   System.out.println("id of getproduct thread: ");
	}
	}
}
class AddProducts extends Thread//ad
{
	public  void run() {
		synchronized (this) {
		System.out.println("this is add products");
		//System.out.println("id of addproduct thread: "+Thread.currentThread().getId());
	}
	}
}
class VerifyProducts extends Thread
{
	public   void run() {
		synchronized (this) {
		try {
		System.out.println("your product has verified");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}
}
class Payment extends Thread
{
	public   void run() {
		synchronized (this) {
		System.out.println("payment conformation");	
		//System.out.println("is alive: "+Thread.currentThread().isAlive());
	}
	}
}
class Receipt extends Thread
{
	public   void run() {
		synchronized (this) {
		System.out.println("Print Receipt");
	}
	}
}

public class  Shoping {

	public static void   main(String[] args) throws InterruptedException {
		
	
		
		GetListOfProducts gp=new GetListOfProducts();
		AddProducts ad= new AddProducts();
		VerifyProducts vp=new VerifyProducts();
		Payment p = new Payment();
		Receipt r = new Receipt();

		gp.start();
		ad.start();
	
		vp.start();
		//gp.sleep(2000);
		p.start();
		r.start();
	}

}
