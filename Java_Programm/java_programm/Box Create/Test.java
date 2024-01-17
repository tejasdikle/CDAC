package com.cdac.core1;
import java.util.*;

public class Test 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length and Width and Heigth:");
		BCreate box1= new BCreate(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("The Diamention of all side =>"+box1.Displaydiamention());
		
		System.out.println("Enter the side of cube ");
		BCreate box2 = new BCreate(sc.nextDouble());
		System.out.println("The Diamention of all side =>"+box2.Displaydiamention());
		
		System.out.println("both are equal or not (true / false) =>"+box1.isEqual(box2));
		
		System.out.println("Volume of Box one "+box1.Calculatevolume(box2));
		System.out.println("Volume of BOx two "+box2.Calculatevolume(box1));
		
		System.out.println("Enter the offset value of lenght , width , height");
		BCreate box3 = new BCreate(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("Diamention are "+box3.Displaydiamention());
		
	}
}