package DAL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class DBConnect {
	private static final String URL="jdbc:mysql://192.168.154.92:3306/gymnastics_system" + 
			"?serverTimezone=UTC";
	private static final String USER="root";
	private static final String PASSWORD="160035";
 
	private static Connection conn = null;
 
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public static Connection getConnection(){//√ª”√
		return conn;
	}
	public static Statement getStmt() throws SQLException{
		return conn.createStatement();
	}
	public static PreparedStatement getPreparedStmt(String sql) throws SQLException{
		return conn.prepareStatement(sql);
	}
}
