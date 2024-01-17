package dao;

import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Player;

public class PlayerDaoImpl implements PlayerDao {

	@Override
	public String AddPlayerDetails(Player player, Integer id) {
		String msg="adding player failed ";
		System.out.println("in PlayerDaoimpl");
		//String jpql="select t.abbrevation from Team t";
		Session session = getFactory().getCurrentSession(); //get session.save
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			player= session.get(Player.class, id);
			//end of try => success
			tx.commit();
		} catch (RuntimeException e) {
			// rollback tx n re throw the exc to the caller
			if (tx != null)
				tx.rollback();
			throw e;
		} 
				return msg;
	}

}
