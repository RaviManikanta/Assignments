package com.yash.multithreading;

class FirstThread
{
	public void display(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(1000);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class SecondThread extends Thread
{
	String msg;
	FirstThread fobj;
	SecondThread(FirstThread fp,String str)
	{
		
		start();
	}
	public void run()
	{
		fobj.display(msg);
		
	}
}
public class SynchronizedDemo 
{
  public static void main(String args[])
  {
	  FirstThread fnew = new FirstThread();
	  SecondThread ss= new SecondThread(fnew,"Welcome");
	  SecondThread ss1=new SecondThread(fnew,"Hello");
	  SecondThread ss2 = new SecondThread(fnew,"Trainees");
  }
}
