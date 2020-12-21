  
package business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.MyOrder;
import data.OrdersDataService;

@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface {

	@EJB
	OrdersDataService service;
	
	@Override
	public List<MyOrder> getOrders() {
		// TODO Auto-generated method stub
		List<MyOrder> myOrder = service.findAll();
		
		
		return myOrder;
	}
}
