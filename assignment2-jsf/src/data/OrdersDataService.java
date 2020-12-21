package data;

import java.util.List;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import beans.MyOrder;

public class OrdersDataService implements DataAccessInterface {

	@PersistenceContext(unitName="assignment4c")
	EntityManager em;
	
	public List<MyOrder> findAll() {
		// TODO Auto-generated method stub
		
		List orders = em.createNamedQuery("MyOrder.findAll", MyOrder.class ).getResultList();
		
		return orders;
	}

}
