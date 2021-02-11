import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FInsert {
	public int StudentInsert(Bean b) throws ClassNotFoundException, SQLException
	{
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps=con.prepareStatement("insert into Feedback values(?,?,?,?);");
		ps.setString(1,b.getF1());
		ps.setString(2,b.getF2());
		ps.setString(3,b.getF3());
		ps.setString(4,b.getF4());
		int i=ps.executeUpdate();
		return i;
		
	}
	public ResultSet StudentProfile(Bean b) throws ClassNotFoundException, SQLException
	{
		
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps=con.prepareStatement("select * from Feedback;");
		ResultSet rs=ps.executeQuery();
		return rs;
		
	}

}
