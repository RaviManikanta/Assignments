package com.yash.util.ass_inheritance_polymor;

interface test
{
	int square();
}
class arithmetic implements test
{
	int b;
	arithmetic(int x)
	{
		b = x;
	}
	public int square()
	{
		return (b*b);
	}
}
class ToTestInt
{
	public int return_ans(int x)
	{
		arithmetic a=new arithmetic(x);
		return a.square();
	}
}