package pojos;

import java.sql.Date;

public class Employee 
{
	private int empId;
	private String name;
	private String address;
	private double salary;
	private String deptid;
	private Date join_date;
	
	public Employee(int empId, String name, String address, double salary, String deptid, Date join_date) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.deptid = deptid;
		this.join_date = join_date;
	}
	
	public Employee(String name, String address, double salary, String deptid, Date join_date) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.deptid = deptid;
		this.join_date = join_date;
	}
	
	
	public Employee(int empId, String name, double salary, Date join_date) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.join_date = join_date;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary
				+ ", deptid=" + deptid + ", join_date=" + join_date + "]";
	}

	
	
	
	
	

}
