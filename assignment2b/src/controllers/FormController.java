package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped

public class FormController {

	public String onSubmit(User user) {
		FacesContext contxt = FacesContext.getCurrentInstance();
		contxt.getExternalContext().getRequestMap().put("users", user);
		return "TestResponce.xhtml";
	}
	
	public String onFlash(User user) {
		FacesContext contxt = FacesContext.getCurrentInstance();
		contxt.getExternalContext().getFlash().put("user", user);
		return "TestResponse2.xhtml?faces-redirect=true";
	}
}
