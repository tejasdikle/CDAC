import java.util.*;
public class Tester 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);		//Memory allocation
		
		System.out.println("Enter the first co-ordinate for point 1 ");
		System.out.println("d1:  ");
		double d1 = sc.nextDouble();
		System.out.println("d2:  ");
		double d2 = sc.nextDouble();
		Point2D p1 = new Point2D(d1,d2);
		
		System.out.println("Enter the second co-ordinate for point 2 ");
		System.out.println("d3:  ");
		double d3 = sc.nextDouble();
		System.out.println("d4:  ");
		double d4 = sc.nextDouble();
		Point2D p2 = new Point2D(d3,d4);
		
		
		System.out.println("Point 1:" + p1.Showdata());
		System.out.println("Point 2:" + p2.Showdata());
		
		if(p1.isEqual(p2))
		{
			System.out.println("Both are same ");
		}
		else
		{
			System.out.println("Different");
		}
		double dist =p1.Calculatedistance(p2);
		{
			System.out.println("Distance between two number =>" +dist);
		}
		
		
		sc.close();
		
		
		
		
	}
}
