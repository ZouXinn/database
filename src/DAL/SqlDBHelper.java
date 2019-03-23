package DAL;
import java.sql.*;


public class SqlDBHelper {
	Connection connetcion = DBConnect.getConnection();
	Statement stmt;
	ResultSet rs;
	PreparedStatement pStmt;
	
	
	public ResultSet check(String sql) {
		try {
			stmt = DBConnect.getStmt();
			rs = stmt.executeQuery(sql);
		}catch(SQLException ex){
			return null;
		}
		return rs;
	}
	public boolean delete(String sql) {
		try {
			stmt = DBConnect.getStmt();
			rs = stmt.executeQuery(sql);
		}catch(SQLException ex){
			return false;
		}
		return true;
	}
	public boolean insertOrdelete(String sql) {
		boolean done;
		try {
			pStmt = DBConnect.getPreparedStmt(sql);
			done= pStmt.execute();
		}catch(SQLException ex){
			return false;
		}
		return done;
	}
}
