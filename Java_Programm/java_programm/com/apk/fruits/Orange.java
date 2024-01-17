package com.apk.fruits;

public class Orange extends Fruit {

	public Orange(String colour ,double weight ,String name ,boolean fresh)
	
	{
		super (colour ,weight ,name,fresh);
	}
	public void juice ()
	{
		System.out.println(getname()+"Making juice");
	}
	@Override 
	public String test()
	{
		return "Sour";
	}
}
