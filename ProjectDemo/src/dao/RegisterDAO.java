package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.Customer;

public class RegisterDAO 
{
	Connection conn;
	
	public RegisterDAO()throws Exception
	{
		conn=dbconn.DBConnection.getConn();
	}
	
	public boolean registerCustomer(Customer customer)throws Exception
	{
		PreparedStatement psmt=conn.prepareStatement("insert into Customer values(?,?,?,?,?,?,?)");
		
		psmt.setString(1,customer.getLoginName());
		psmt.setString(2,customer.getPassword());
		psmt.setString(3,customer.getCustomerName());
		psmt.setString(4,customer.getGender());
		psmt.setString(5,customer.getEmailid());
		psmt.setString(6,customer.getAddress());
		psmt.setString(7,customer.getMobile());
		
		int row_eff=psmt.executeUpdate();
		
		if(row_eff>0)
			return true;
		else
			return false;
	}
	
}
