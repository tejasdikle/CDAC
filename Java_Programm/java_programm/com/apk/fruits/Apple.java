package com.apk.fruits;

public class Apple extends Fruit {
	
	public Apple (String colour ,double weight ,String name ,boolean fresh)
	{
		super (colour ,weight ,name,fresh);
	}
	public void sos()
	{
		System.out.println(getname()+"Making sos");
	}
	@Override
	public String test()
	{
		return "Sweet and sour ";
	}
}
