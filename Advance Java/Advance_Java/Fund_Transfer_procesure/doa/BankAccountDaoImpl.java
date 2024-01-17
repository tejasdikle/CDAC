package doa;
import static utils.DBUtils.fetchDBConnection;
import java.sql.*;
import java.sql.SQLException;
public class BankAccountDaoImpl implements IBankAccountDao 
{
	private Connection cn;
	private CallableStatement cst1;
	
	public BankAccountDaoImpl() throws ClassNotFoundException,SQLException
	{
		cn=fetchDBConnection();
		String invocationSyntax ="{call transfer_funds_proc(?,?,?,?,?)}";
		cst1=cn.prepareCall(invocationSyntax);
		
		cst1.registerOutParameter(4,Types.DOUBLE);
		cst1.registerOutParameter(5,Types.DOUBLE);
	}
	

	
	@Override
	public String transeferFund(int srcId, int desId, double amount) throws SQLException {
		cst1.setInt(1, srcId);
		cst1.setInt(2, desId);
		cst1.setDouble(3, amount);
		cst1.execute();
		//use CSTs getter to get the result parameter stored in out parameter
		StringBuilder sb =new StringBuilder("Funds transfer");
		sb.append("update Src balance "+cst1.getDouble(4));
		sb.append("update Dest balance"+cst1.getDouble(5));
		return sb.toString();
	}
	public void cleanup() throws SQLException
	{
		if(cst1!=null)
			cst1.close();
		if(cn!=null)
			cn.close();
	}

}
