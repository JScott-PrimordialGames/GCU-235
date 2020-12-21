package data;

import java.util.List;

import beans.MyOrder;

public interface DataAccessInterface {

	public List<MyOrder> findAll();
}
