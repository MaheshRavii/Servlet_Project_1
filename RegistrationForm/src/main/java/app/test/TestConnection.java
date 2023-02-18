package app.test;

import java.sql.Connection;

import app.util.FormDBUtil;

public class TestConnection 
{
	public static void main(String[] args) 
	{
		Connection con  = FormDBUtil.getConnection();
		System.out.println(con);
	}
}
