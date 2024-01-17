package com.cdac.core1;

public class BCreate 
{
	private double length;
	private double width;
	private double height ;
	
	BCreate(double length ,double width , double height )
	{
		this.length=length;
		this.width=width;
		this.height=height;
		
	}
	public BCreate(double side)
	{
		this(side,side,side);
	}
	public String Displaydiamention()
	{
		return "Length ="+this.length+" Width ="+this.width+" Height ="+this.height;
	}
	public boolean isEqual(BCreate box2)
	{
		if (this.length == box2.length) {return true;}
		if (this.width == box2.width) {return true;}
		if (this.height == box2.height) {return true;}
		return false;
	}
	public double Calculatevolume(BCreate box2)
	{
		return this.length*this.width*this.height;
	}
	public BCreate Offset(double offsetLength, double offsetDepth, double offsetHeight) 
	{
		BCreate box2=new BCreate(this.length + offsetLength, this.width + offsetDepth, this.height+offsetHeight);
		return box2;
	}
	

}
