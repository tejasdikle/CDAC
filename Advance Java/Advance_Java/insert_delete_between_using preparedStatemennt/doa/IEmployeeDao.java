package doa;

import java.util.List;
import java.sql.*;
import pojos.Employee;

public interface IEmployeeDao 
{
	List<Employee>getSelectedEmpDetails(String deptId ,String beginDate ,String endDate)throws SQLException;
	String addEmpDetails(Employee emp) throws SQLException;
	String updateEmpDetails(int empId,String newDept ,double salIncrement ) throws SQLException;
	String deleteEmpDetails(int empId)throws SQLException;
}
