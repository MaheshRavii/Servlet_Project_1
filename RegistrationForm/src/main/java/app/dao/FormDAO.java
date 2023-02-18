package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import app.dto.FormDTO;
import app.util.FormDBUtil;

public class FormDAO
{
	public boolean addDetails(FormDTO dto)
	{
		boolean res = true;
		Connection con = FormDBUtil.getConnection();
		try 
		{
			PreparedStatement pstmt = con.prepareStatement("insert into form values(?,?,?,?,?,?)");
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setInt(3, dto.getAge());
			pstmt.setString(4, dto.getOccupation());
			pstmt.setString(5, Arrays.toString(dto.getSkills()));
			pstmt.setString(6, dto.getCmds());
			int nori = pstmt.executeUpdate();
			if(nori != 1)
			{
				return false;
			}
		} catch (SQLException e) 
		{
			res = false;
			e.printStackTrace();
		}
		return res;
	}
}
