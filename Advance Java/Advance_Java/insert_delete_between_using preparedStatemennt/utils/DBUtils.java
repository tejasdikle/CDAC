package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils 
{
	private static Connection connection;
	public static Connection fetchDBConnection()throws ClassNotFoundException,SQLException
	{
		if(connection == null)
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url =("jdbc:mysql://localhost:3306/act?useSSL=false&allowPublicKeyRetrival=true");
		connection = DriverManager.getConnection(url,"root","Tejas@2001");
		}
		return connection;
		
	}
	

}
