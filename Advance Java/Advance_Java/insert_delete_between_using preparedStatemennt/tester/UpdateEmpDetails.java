package tester;

import java.util.List;
import java.util.Scanner;

import doa.EmployeeDaoImpl;
import pojos.Employee;

public class UpdateEmpDetails {

	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			EmployeeDaoImpl empDao = new EmployeeDaoImpl();
			System.out.println("Enter Empid new dept and sal increment ");
			String message = empDao.updateEmpDetails(sc.nextInt(), sc.next(), sc.nextDouble());
			System.out.println(message);
			empDao.cleanup();
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
		
		
			
		

	}

}
