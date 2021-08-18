package com.yash.multithreading;

//Example that shows multiple threads
//can execute the same method but in
//synchronized way.
class Line
{

	// if multiple threads(trains) trying to access
	// this synchronized method on the same Object
	// but only one thread will be able
	// to execute it at a time.
	synchronized public void getProduct()
	{	
			try
			{
				Thread.sleep(400);
				
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		
	}
}

class Getpr extends Thread
{
	// Reference variable of type Line.
	Line le;

	Getpr(Line line)
	{
		this.le = line;
	}

	@Override
	public void run()
	{
		
		System.out.println("1 getproducts");
		System.out.println("id of addproduct thread: "+Thread.currentThread().getId());
		System.out.println("end of getproduct");
		le.getProduct();
	}
}
///////////////////////////////////////////

class Addp extends Thread
{
	Line le;
	Addp(Line line)
	{
		this.le = line;
	}

	@Override
	public void run()
	{
		le.getProduct();
		System.out.println("2 addproductas");
	}
}
///////////////////////////////
class Verify extends Thread
{
	Line le;
	Verify(Line line)
	{
		this.le = line;
	}

	@Override
	public void run()
	{
		le.getProduct();
		System.out.println("3 verify cart");
	}
}
//////////////////////////

class Pay extends Thread
{
	Line le;
	Pay(Line line)
	{
		this.le = line;
	}

	@Override
	public void run()
	{
		le.getProduct();
		System.out.println("4 Payment done");
	}
}


////////////////////////////////

class MyThread1
{
	public static void main(String[] args)
	{
		Line obj = new Line();

		// we are creating two threads which share
		// same Object.
		Getpr train1 = new Getpr(obj);
		Addp train2 = new Addp(obj);
		Pay train3 = new Pay(obj);
		Verify train4= new Verify(obj);
		
		// both threads start executing .
		train1.start();
		train2.start();
		train3.start();
		train4.start();
		
	}
}
