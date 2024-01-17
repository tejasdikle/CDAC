package tester;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import doa.EmployeeDaoImpl;
import pojos.Employee;

public class InsertEmpDetails {

	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			EmployeeDaoImpl empDao = new EmployeeDaoImpl();
			System.out.println("Enter Name ,address ,salary ,deptId ,join_date(yy-mm-dd)");
			String message =empDao.addEmpDetails(new Employee(sc.next(),sc.next(),sc.nextDouble(),sc.next(),Date.valueOf(sc.next())));
			System.out.println(message);
			empDao.cleanup();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		

	}

}
