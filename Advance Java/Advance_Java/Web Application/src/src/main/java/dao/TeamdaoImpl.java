package dao;

import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TeamdaoImpl implements TeamDao {

	@Override
	public List<String> getTeamsAbbrivation() 
	{
		List<String>player=null;
		System.out.println("in daoimpl");
		String jpql="select t.abbrevation from Team t";
		Session session = getFactory().getCurrentSession(); //get session.save
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			player=session.createQuery(jpql,String.class).getResultList();
			//end of try => success
			tx.commit();//execute
		} catch (RuntimeException e) {
			// roll back tx n re throw the exc to the caller
			if (tx != null)
				tx.rollback();
			throw e;
		} 
		return player;

	
	}

}
