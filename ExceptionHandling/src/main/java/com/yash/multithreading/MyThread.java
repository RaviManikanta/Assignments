package com.yash.multithreading;




class First
{
  synchronized public void getProducts()
  {
    System.out.print ("getproducts before try block ");
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println ("get products after try block");
  }
}

class Second extends Thread
{
  public void run()
  {
    System.out.println("d,svnmnvb");
  }
}
class Payme extends Thread
{	 

	public void run()
	{
		System.out.println("paid amount");
		
		//payment(amount);
	}
}

class Addpro extends Thread
{	 

	public void run()
	{
		System.out.println("products added");
		
		//payment(amount);
	}
}

class Verifyca extends Thread
{	 
	public Verifyca() {
		start();
	}

	public void run()
	{
		System.out.println("cart verified");
		
		//payment(amount);
	}
}

public class MyThread
{
  public static void main (String[] args)
  {
    //First fnew = new First();
    Second ss = new Second();
    Payme p = new Payme();
    Addpro ad= new Addpro();
    Verifyca vc = new Verifyca();
    ss.start();
    p.start();
    ad.start();
  }
}
