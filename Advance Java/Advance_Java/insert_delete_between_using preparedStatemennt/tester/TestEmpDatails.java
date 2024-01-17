package tester;

import java.util.List;
import java.util.Scanner;

import doa.EmployeeDaoImpl;
import pojos.Employee;

public class TestEmpDatails {

	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			EmployeeDaoImpl empDao = new EmployeeDaoImpl();
			System.out.println("Enter deptid begin date and end date to fetch details");
			List<Employee>empList = empDao.getSelectedEmpDetails(sc.next(), sc.next(), sc.next());
			empList.forEach(System.out::println);
			empDao.cleanup();
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
			
		

	}

}
