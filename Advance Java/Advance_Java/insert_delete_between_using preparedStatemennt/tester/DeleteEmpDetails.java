package tester;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import doa.EmployeeDaoImpl;
import pojos.Employee;

public class DeleteEmpDetails {

	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			
			EmployeeDaoImpl empDao = new EmployeeDaoImpl();
			System.out.println("Enter Empid to delete employee ");
			String message = empDao.deleteEmpDetails(sc.nextInt());
			System.out.println(message);
			empDao.cleanup();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		

	}

}
