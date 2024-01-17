package core.com.login;

public class CustomerDetails 
{
	String id;
	String first_name;
	String last_name;
	
	
	 
	
	public CustomerDetails(String id, String first_name, String last_name) 
	{
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	
	
	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	

}
