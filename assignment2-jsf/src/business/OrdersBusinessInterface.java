package business;

import java.util.List;

import javax.ejb.Local;

import beans.MyOrder;

public interface OrdersBusinessInterface {
	public List<MyOrder> getOrders();

}
