package beans;

import dao.PlayerDao;
import dao.PlayerDaoImpl;
import dao.TeamDao;
import dao.TeamdaoImpl;

public class PlayerBean {
//clints conversational state
	private String myTeam;
	private String fn;
	private String ln;
	private String dob;
	private Double avg;
	private int wickets;
	//dep : teamdao and player dao
	private TeamDao tDao;
	private PlayerDao pDao;
	public PlayerBean() {
		tDao=new TeamdaoImpl();
		pDao=new PlayerDaoImpl();
	}
	public String getMyTeam() {
		return myTeam;
	}
	public void setMyTeam(String myTeam) {
		this.myTeam = myTeam;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = avg;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public TeamDao gettDao() {
		return tDao;
	}
	public void settDao(TeamDao tDao) {
		this.tDao = tDao;
	}
	public PlayerDao getpDao() {
		return pDao;
	}
	public void setpDao(PlayerDao pDao) {
		this.pDao = pDao;
	}
	
	
}
