import java.util.*;
class Point2D 
{
	private
		double x;
		double y;
		
	Point2D(double x ,double y)
	{
		this.x=x;
		this.y=y;
	}
	public String Showdata()
	{
		return "(" + x + " " + y + ")";
	}
	public boolean isEqual(Point2D other)
	{
		return this.x==other.x && this.y==other.y;
	}
	public  double Calculatedistance(Point2D other)
	{
		double num1 = this.x - other.x;
		double num2 = this.y - other.y;
		return Math.sqrt(num1*num1 + num2*num2);
	}
	

}
