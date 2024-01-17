//First create this data in data base 

//create database moneytxn;
//use moneytxn;
//create table accounts(id int auto_increment primary key ,name varchar(20),type varchar(10),bal double);
//insert into accounts (name,type,bal) values ('aa','sav',1500);
//insert into accounts (name,type,bal) values ('bb','sav',2500);
//
//DELIMITER $$
//create  procedure transfer_funds_proc(
// in sid int ,
// in did int,
// in amt double ,
// out sbal double,
// out dbal double 
//) 
//begin
//update accounts set bal=bal-amt where id=sid;
//update accounts set bal=bal+amt where id=did;
//select bal into sbal from accounts where id=sid;
//select bal into dbal from accounts where id=did;
//end$$
// DELIMITER ;

package pojos;

public class BankAccount 
{
	private int id ;
	private String name ;
	private String acType;
	private double balance;
	
	public BankAccount()
	{
		System.out.println("Default constructor called ");
	}

	public BankAccount(int id, String name, String acType, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.acType = acType;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", name=" + name + ", acType=" + acType + ", balance=" + balance + "]";
	}
	 

}
