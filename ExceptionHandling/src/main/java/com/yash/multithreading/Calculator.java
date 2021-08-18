package com.yash.multithreading;
import java.lang.Thread;

public class Calculator implements Runnable
{
	/*public void join() {
		try {
			Thread.currentThread().join(5000);
			System.out.println("join");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}*/
	
	public void run()
	{
      int i=4,j=5;
      double k;
      try
      {
    	  k=i+j;    	 
    	  System.out.println("sum : "+k);
    	 // Thread.sleep(5000);    //thread waits for 5 seeconds to complete execution
    	  k=i*j;
    	  System.out.println("multiplication: "+k);
    	  //Thread.sleep(4000);
    	  k=i/j;
    	  System.out.println("division: "+k);
    	  
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
   
	}	
	public static void main (String args[]) throws InterruptedException
	{
		Calculator c = new Calculator();
		Thread t = new Thread(c);
		
		t.start();
		System.out.println("----Airthmatic operations---");

		Thread t1 = new Thread(c);
		
		t1.start();
		//t1.join();
	}
}
