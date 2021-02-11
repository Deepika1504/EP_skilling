

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registration
 */
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public registration() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("regno"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		int year=Integer.parseInt(request.getParameter("year"));
		int sec=Integer.parseInt(request.getParameter("sec"));
		StudentBean sb=new StudentBean();
		sb.setRegno(regno);
		sb.setName(name);
		sb.setEmail(email);
		sb.setPassword(password);
		sb.setYear(year);
		sb.setSec(sec);
		DAO d=new DAO();
		PrintWriter pw=response.getWriter();
		try {
			int i=d.StudentInsert(sb);
			if(i>0)
			{
				pw.print("Welcome"+" "+sb.getName());
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.forward(request,response);
			}
			else {
				pw.print("Failed!");
				
			}
				
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
