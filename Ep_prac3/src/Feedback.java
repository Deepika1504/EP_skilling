

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Feedback
 */
public class Feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Feedback() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String f1=request.getParameter("f1");
		String f2=request.getParameter("f2");
		String f3=request.getParameter("f3");
		String f4=request.getParameter("f4");
		Bean b=new Bean();
		b.setF1(f1);
		b.setF2(f2);
		b.setF3(f3);
		b.setF4(f4);
		FInsert f=new FInsert();
		PrintWriter pw=response.getWriter();
		try {
			int i=f.StudentInsert(b);
			if(i>0)
			{
				pw.print(f1+" "+f2+" "+f3+" "+f4);
				
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
