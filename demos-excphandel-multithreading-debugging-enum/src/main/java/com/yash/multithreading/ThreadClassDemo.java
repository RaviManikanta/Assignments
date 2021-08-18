package com.yash.multithreading;
import java.lang.Thread;

public class ThreadClassDemo extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
				System.out.println(i);
			System.out.println("this is thread: "+Thread.currentThread().getId());
			System.out.println("is alaive:"+Thread.currentThread().isAlive());
			Thread.sleep(5000);
			System.out.println("execting sleep method");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		ThreadClassDemo t = new ThreadClassDemo();
		t.start();
		System.out.println(t.isAlive());
	}
}
