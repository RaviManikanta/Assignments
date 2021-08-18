package com.yash.functionalinterface;
@FunctionalInterface
interface Addition
{
	public void add(int a,int b);
	
}
interface Division
{
	public void div(int a, int b);
	default void msg()
	{
		System.out.println("division done");
	}
	static void end()
	{
		System.out.println("----------");
	}
}

public class LambdaExpressionDemo  {

	public static void main(String[] args) {
		
   //------------------------------------------------//
		Addition  ad= (a,b)->System.out.println(a+b);		
		 ad.add(5, 6);
		 System.out.println("addition done");
		 
  //---------------------------------------------------// 
		 try {
		 Division di = (a,b)->System.out.println(a/b);
		 di.div(5, 5);
		 di.msg();			
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 Division.end();
  //----------------------------------------------------//
		 
	}

}
