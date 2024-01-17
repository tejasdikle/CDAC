package pojos;
/*
 * 	id (PK), first_name,last_name, dob,batting_avg,wickets_taken....
	+team_id (FK)
 */

import java.time.LocalDate;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="players")
public class Player extends BaseEntity {

	private String firstName;
	private String lastName;
	private LocalDate dob;
	private double battingAvg;
	private int wicketsTaken;
	//many child 
	@ManyToOne
	@JoinColumn(name = "team_id",nullable = false)
	private Team myTeam;
	
	
	public Team getMyTeam() {
		return myTeam;
	}
	public void setMyTeam(Team myTeam) {
		this.myTeam = myTeam;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Player() {
		System.out.println("default constructor");
	}
	public Player(int playerId, String firstName, String lastName, LocalDate dob, double battingAvg, int wicketsTaken,
			int teamId) 
	{
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
	
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void LocalsetDob(LocalDate dob) {
		this.dob = dob;
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

	@Override
	public String toString() {
		return "Player [playerId=" + getId()+ ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken +  "]";
	}
	
}
