package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import business.OrdersBusinessInterface;


@ManagedBean
public class Orders {

	@Inject 
	OrdersBusinessInterface service;

	List <MyOrder> orders = new ArrayList<MyOrder>();
	
	void init()
	{
		orders = service.getOrders();
	}
	
	
	public List<MyOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<MyOrder> orders) {
		this.orders = orders;
	}
	
}