package Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import core.com.login.CustomerDetails;

public class Test 
{
	List<CustomerDetails> custdetails = new ArrayList<>();
	public static void main(String []args)
	{
		
		try(Scanner sc= new Scanner (System.in);)
		{
			boolean exit =false ;
			while(!exit)
			{
				System.out.println("-------------------------------------");
				System.out.println("            Customer portal");
				System.out.println("-------------------------------------");
				
				System.out.println("\t1.Add customer\n\t2.Show Customer ");
				System.out.println("\t----------------");
				switch(sc.nextInt())
				{
					case 1:
					{
						System.out.println("Enter customer id first_name last_name :");
						String details = sc.next()sc.next();	
						System.out.println("===============");
						System.out.println("Add successfully");
						System.out.println("===============");
		
					}
					case 2:
					{
						for (int i =0 ;i<=)
						{
							
						}
					}
				}
				
			}
		}
		
		
		
	}
}
