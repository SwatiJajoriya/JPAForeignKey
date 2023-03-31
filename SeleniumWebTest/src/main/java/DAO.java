import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
	
 public static int insertion(String user) throws ClassNotFoundException, SQLException {
	 
	 Connection con=DBUtil.getConnection();
	 String sql="insert into User values(?)";
	 PreparedStatement ps=con.prepareStatement(sql);
	 ps.setString(1, user);
	 return ps.executeUpdate();
	 
	 
		 
		 
	 
	 
 }
	
}
