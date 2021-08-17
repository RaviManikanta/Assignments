package com.yash.util.ass_inheritance_polymor;

public class Employee extends Person {

	
	private long joiningYear;
	private double annualSalary;
	private String natInsNum;

	Employee(String name,double joiningYear,double annualSalary,String natInsNum)
	{
		super(name);
		
		this.joiningYear = (long) joiningYear;
		this.annualSalary = annualSalary;
		this.natInsNum = natInsNum;	

	}
	void getDetails()
	{
		System.out.println(" name:  "+name+"  joning year of employee  : "+joiningYear+"   annualsalary of employe:  "+annualSalary+ "  national insurance number "+natInsNum);
	}

}
