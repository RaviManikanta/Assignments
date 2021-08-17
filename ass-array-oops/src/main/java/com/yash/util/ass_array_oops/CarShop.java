package com.yash.util.ass_array_oops;

public class CarShop {
	public int speed;
	public String carOwner;
	public String carType;
	public  int carSold=0;



	void  setDetails(int speed,String carOwner,String carType,int i) {
		this.speed=speed;
		this.carOwner=carOwner;
		this.carType=carType;
		this.carSold=i;
		i++;

	}
	void getDetails()
	{
		System.out.println("car speed: "+speed+"     carOwner: "+carOwner+"     carType :  "+carType+ "num of carsold:  "+carSold);
	}

}
