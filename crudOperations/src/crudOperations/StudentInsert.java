package crudOperations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class StudentInsert {
	Scanner sc=new Scanner(System.in);
	
	public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con=DBConn.DBConnection();
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,student.getRegno() );
		ps.setString(2, student.getName());
		ps.setString(3, student.getEmail());
		int i=ps.executeUpdate();
		return i;
		
	}
	public int StudentDelete() throws ClassNotFoundException,SQLException{
		System.out.println("Enter the student regno to  be deleted");
		int num=sc.nextInt();
		Connection con=DBConn.DBConnection();
		PreparedStatement stmt=con.prepareStatement("delete from Student where regno=?");
		stmt.setInt(1, num);
		int j=stmt.executeUpdate();
		con.close();
		return j;
	}
	public int StudentUpdate() throws ClassNotFoundException,SQLException{
		System.out.println("please Enter Your to be updated name and student id");
		String name=sc.next();
		int num=sc.nextInt();
		Connection con=DBConn.DBConnection();
		PreparedStatement stmt=con.prepareStatement("update Student set name=? where regno=?");
		stmt.setString(1, name);
		stmt.setInt(2, num);
		int k=stmt.executeUpdate();
		con.close();
		return k;
	}
	public void StudentDisplay() throws ClassNotFoundException,SQLException{
		System.out.println("The student details are:");
		Connection con=DBConn.DBConnection();
		PreparedStatement stmt=con.prepareStatement("Select * from Student");
		ResultSet res=stmt.executeQuery();
		System.out.println("REGD NO.\tNAME\tEMAIL");
		while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3));
		}
		
		con.close();
		
	}

}

