package studentsManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.*;

public class StudentInsertion {
	Scanner sc= new Scanner(System.in);
	public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con=DBUTil.DBConnection();
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,student.getRegdno() );
		ps.setString(2, student.getName());
		ps.setString(3, student.getEmail());
		int i=ps.executeUpdate();
		return i;
	}
	public int StudentDelete() throws ClassNotFoundException,SQLException{
		System.out.println("ENter the student details to be deleted");
		int num=sc.nextInt();
		Connection con=DBUTil.DBConnection();
		PreparedStatement stmt=con.prepareStatement("delete from Student where regdno=?");
		stmt.setInt(1, num);
		int j=stmt.executeUpdate();
		con.close();
		return j;
	}
	public int StudentUpdate() throws ClassNotFoundException,SQLException{
		System.out.println("Enter the student details to be updated i.e  name and student id");
		String nam=sc.next();
		int num=sc.nextInt();
		Connection con=DBUTil.DBConnection();
		PreparedStatement stmt=con.prepareStatement("update Student set name=? where regdno=?");
		stmt.setString(1, nam);
		stmt.setInt(2, num);
		int k=stmt.executeUpdate();
		con.close();
		return k;
	}
	public void StudentDisplay() throws ClassNotFoundException,SQLException{
		System.out.println("The student details are:");
		Connection con=DBUTil.DBConnection();
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
