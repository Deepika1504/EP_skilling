package studentsManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUTil {
	public static Connection DBConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Saideepi@123");
		return con;

}
}