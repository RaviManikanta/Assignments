package com.yash.multithreading;
import java.lang.*;


class Addprodu extends Thread
{
	
	public void run()
	{
		System.out.println("dsjbvj");
	}
}

public class WithoutSyncDemo {

	public static void main(String args[])
	{
		Addprodu ad = new Addprodu();
		ad.start();
	}
}
