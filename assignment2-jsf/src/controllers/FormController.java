package controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

import beans.MyOrder;
import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController {

	@Inject
	OrdersBusinessInterface services;
	
	@EJB
	MyTimerService timer;
	
	@PersistenceContext(unitName="assignment4a")
	EntityManager em;
	
	
	public String onSubmit(){
		
		List<MyOrder> orders = em.createNamedQuery("MyOrder.findAll", MyOrder.class ).getResultList();
		System.out.println("===> Number of ordered returned is " + orders.size());
		
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		timer.setTimer(10000);
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponce.xhtml";
	}
	
	public OrdersBusinessInterface getService() {
		return services;
	}
}
