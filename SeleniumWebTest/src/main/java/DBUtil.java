import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static final String classpath="com.mysql.jdbc.Driver";
	public static final String url="jdbc:mysql://localhost:3306/insertdb";
	public static final String username="root";
	public static final String password="123456";
	
	
	public static Connection getConnection() throws  SQLException, ClassNotFoundException  {
		
		Class.forName(classpath);
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}
}
