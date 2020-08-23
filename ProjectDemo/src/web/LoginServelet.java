package web;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.login_bean;
import LDAO.loginDao;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/login")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private loginDao loginDao;

	public void init() {
		loginDao = new loginDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("loginName");
		String password = request.getParameter("password");
		login_bean loginBean = new login_bean();
		loginBean.setloginName(username);
		loginBean.setpassword(password);

		try {
			if (loginDao.validate(loginBean)) {
				HttpSession session = request.getSession();
				session.setAttribute("username",username);
				response.sendRedirect("loginsuccess.jsp");
			} 
			else {
				HttpSession session = request.getSession();
				session.setAttribute("user", username);
				response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
