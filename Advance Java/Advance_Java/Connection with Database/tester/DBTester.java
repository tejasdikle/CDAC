package tester;

import java.sql.*;
import static utils.DBUtils.fetchDBConnection;


public class DBTester 
{

	public static void main(String[] args) 
	{
		try(Connection cn = fetchDBConnection();
				Statement st = cn.createStatement();
				ResultSet rst = st.executeQuery("select * from my_emp");)
		{
				while(rst.next())
					System.out.printf("Empl ID %d Name %s Address %s Sal %.1f Dept ID %s Join Date %s%n",
							rst.getInt(1),rst.getString(2),rst.getString(3),rst.getDouble(4),rst.getString(5),rst.getString(6));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


 