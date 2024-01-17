package tester;

import static utils.DBUtils.fetchDBConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Testpst {

	public static void main(String[] args) {
		String sql = "select empid,name,salary,join_date from my_emp where depid=? and join_date between ? and ?";
		try(Scanner sc = new Scanner(System.in);
			Connection cn = fetchDBConnection();
			PreparedStatement pst = cn.prepareStatement(sql); 	
			)
		{
			System.out.println("Enter dept id ,begin and end dates (year-month-day) to fetch emp details");
			 
			pst.setString(1,sc.next());
			pst.setDate(2, Date.valueOf(sc.next()));
			pst.setDate(3,Date.valueOf(sc.next()));
			try(ResultSet rst =pst.executeQuery())
			{
				while(rst.next())
					System.out.printf("ID %d Name %s Salary %.1f Join Date %s%n",rst.getInt(1),rst.getString(2),rst.getDouble(3),rst.getDate(4));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
