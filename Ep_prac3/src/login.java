

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("regno"));
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		if(password.equals("12"))
		{
			Cookie ck=new Cookie("UserSave",name);
			
			pw.print("Login Successfull!");
			response.addCookie(ck);
			
		}
		else {
			pw.print("Please enter Correct Credentials!");
		}
		StudentBean sb=new StudentBean();
		sb.setRegno(regno);
		sb.setName(name);
		sb.setPassword(password);
		DAO d=new DAO();
		
		try {
			ResultSet rs=d.StudentCheck(sb);
			if(rs.next())
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("Feedback.html");
				request.setAttribute("studentbean", sb);
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("error.html");
				rd.include(request, response);
			}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
