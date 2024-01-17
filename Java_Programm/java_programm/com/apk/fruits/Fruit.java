package com.apk.fruits;

public class Fruit {
	
	private String colour ;
	private double weight ;
	private String name ;
	private boolean fresh;
	
	Fruit(String colour ,double weight ,String name,boolean fresh)
	{
		this.colour=colour;
		this.weight=weight ;
		this.name=name;
		this.fresh=fresh;
	}
	String getcolour()
	{
		return colour;
	}
	double getweight()
	{
		return weight;
		
	}
	String getname()
	{
		return name;
	}
	boolean getfresh()
	{
		return fresh;
	}
	void  setcolour(String colour)
	{
		this.colour=colour ;
	}
	void setweight(double weight )
	{
		this.weight = weight ;
	}
	void setname(String name)
	{
		this.name=name;
	}
	public void setstale()
	{
		this.fresh = false;
		
	}
	public boolean isfresh()
	{
		return true;
	}
	public String property()
	{
		return name+" "+colour+" "+weight ;
	}
	public String test()
	{
		return "No specific test";
		
	}
	public String toString()
	{
		return name +" "+colour+" "+weight ;
	}
	

}
