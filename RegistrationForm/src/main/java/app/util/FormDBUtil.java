package app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class FormDBUtil 
{
	private final static String URL = "jdbc:mysql://localhost:3306/register";
	private final static String USER = "root";
	private final static String PASSWORD = "tiger";
	static
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		Connection con =null;
		try
		{
			con = DriverManager.getConnection(URL,USER,PASSWORD);
		}
		catch(Exception e)
		{
			System.out.println("Establishing Connection with DB is FAiled....");
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection( Connection con)
	{
		if(con != null)
		{
			try 
			{
				con.close();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
