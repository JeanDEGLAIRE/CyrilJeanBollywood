package fr.jean.bollywood.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class BollywoodController {
	
	private String actor = "";

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}



}
