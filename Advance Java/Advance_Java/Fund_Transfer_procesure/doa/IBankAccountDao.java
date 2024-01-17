package doa;

import java.sql.SQLException;

public interface IBankAccountDao 
{
	String transeferFund(int srcId,int desId,double amount) throws SQLException;

}
