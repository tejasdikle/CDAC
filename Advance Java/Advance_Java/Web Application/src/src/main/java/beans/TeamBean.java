package beans;

import java.util.List;

import dao.TeamDao;
import dao.TeamdaoImpl;

public class TeamBean 
{
	
	private TeamDao teamdao;
	
	public TeamBean() 
	{
		super();
		
		teamdao=new TeamdaoImpl();
		System.out.println("team bean and team dao is created ");
	}
	public List<String>getTeamsAbbrivation()
	{
		System.out.println("jsp bean teamsAbbrivation");
		return teamdao.getTeamsAbbrivation();
	}
}
