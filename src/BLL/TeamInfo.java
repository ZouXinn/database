package BLL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import DAL.*;
import Model.*;
public class TeamInfo {//队伍、运动员信息
	private String name;
	private String pswd;
	private Coach coach;
	private Judge judge;
	private Doctor doctor;
	private Leader leader;
	private Vector<Player> boyPlayers,girlPlayers;
	public TeamInfo(Coach coach,Judge judge,Doctor doctor,Leader leader,Vector<Player> boyPlayers,Vector<Player> girlPlayers) {
		this.boyPlayers = boyPlayers;
		this.girlPlayers = girlPlayers;
		this.coach = coach;
		this.judge = judge;
		this.doctor = doctor;
		this.leader = leader;
	}
	public void send() {
		sendOthers();
		sendPlayer();
	}
	private void sendOthers() {
		
	}
	private void sendPlayer() {
		try {
			String sql= "";
			PreparedStatement pstmt = DBConnect.getPreparedStmt(sql);
		
		}catch(SQLException ex) {
			
		}
	}
	
}
