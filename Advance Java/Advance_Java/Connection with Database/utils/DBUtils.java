package utils;
import java.sql.*;
public class DBUtils 
{
	private static Connection connection;
	
	public static Connection fetchDBConnection() throws ClassNotFoundException ,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/act?useSSL=false&allowPublicKeyRetrival=true");
		connection=DriverManager.getConnection(url,"root","Tejas@2001");
		return connection;
	}
}
