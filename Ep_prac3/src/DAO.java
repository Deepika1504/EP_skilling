import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	public int StudentInsert(StudentBean sb) throws ClassNotFoundException, SQLException
	{
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps=con.prepareStatement("insert into registration values(?,?,?,?,?,?);");
		ps.setInt(1,sb.getRegno());
		ps.setString(2,sb.getName());
		ps.setString(3,sb.getEmail());
		ps.setString(4,sb.getPassword());
		ps.setInt(5,sb.getYear());
		ps.setInt(6,sb.getSec());
		int i=ps.executeUpdate();
		return i;
		
	}
	public ResultSet StudentCheck(StudentBean sb) throws ClassNotFoundException, SQLException
	{
		
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps=con.prepareStatement("select * from registration where regno=? and name=? ;");
		ps.setInt(1,sb.getRegno());
		ps.setString(2,sb.getName());
		ResultSet rs=ps.executeQuery();
		return rs;
		
	}


}
