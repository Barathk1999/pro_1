package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String loginName=request.getParameter("loginName");
		String password=request.getParameter("passwd");
		String customerName=request.getParameter("custName");
		String gender=request.getParameter("gender");
		String emailid=request.getParameter("emailid");
		String address=request.getParameter("addr");
		String mobile=request.getParameter("mobile");

		entity.Customer customer=new entity.Customer();
		
		customer.setLoginName(loginName);
		customer.setPassword(password);
		customer.setCustomerName(customerName);
		customer.setGender(gender);
		customer.setAddress(address);
		customer.setEmailid(emailid);
		customer.setMobile(mobile);
		
		try
		{
		dao.RegisterDAO registerDAO=new dao.RegisterDAO();
		
		if(registerDAO.registerCustomer(customer))
			out.println("Successfully Registered");
		else
			out.println("Problem Occured");
		
		}
		catch(Exception e)
		{
			out.println("Exception Occured"+e);
		}
		
		
	}

}
