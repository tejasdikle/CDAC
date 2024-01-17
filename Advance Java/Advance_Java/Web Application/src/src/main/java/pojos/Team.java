package pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

//id , name, abbrevation,owner,max_age,batting_avg,wickets_taken
//one,parent,non owning
@Entity
@Table(name = "Teams")
public class Team extends BaseEntity {

	private String name;
	private String abbrevation;
	private String owner;
	private int maxAge;// max age of the player allowed in this team
	private double battingAvg;
	private int wicketsTaken;
	// add team asso property
	// team 1--->Player
	@OneToMany(mappedBy = "myTeam", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Player> players = new ArrayList<>();

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String name, String abbrevation, String owner, int maxAge, double battingAvg,
			int wicketsTaken) {
		super();

		this.name = name;
		this.abbrevation = abbrevation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
	}

	public Team(int teamId, String abbrevation) {
		super();

		this.abbrevation = abbrevation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	// add helper methods
	void addPlayer(Player p) {
		players.add(p);
		p.setMyTeam(this);

	}

	void removePlayer(Player p) {
		players.remove(p);
		p.setMyTeam(null);

	}

	@Override
	public String toString() {
		return "Team [teamId=" + getId() + ", name=" + name + ", abbrevation=" + abbrevation + ", owner=" + owner
				+ ", maxAge=" + maxAge + ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
	}

}
