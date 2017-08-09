package fr.jean.bollywood.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import fr.jean.bollywood.model.Actor;

@ManagedBean
@SessionScoped
public class BollywoodController {

	private Actor actor;
	


	public BollywoodController() {
	}



	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	public List<SelectItem> getActors() {
		List<SelectItem> ret = new ArrayList<>();
		Actor aamir = new Actor("Aamir Khan", "/resources/img/aamir.jpg");
		Actor karishma = new Actor("Karishma Kapoor", "/resources/img/karishma.jpg");
		Actor tunak = new Actor("Tunak Tunak Tun !", "/resources/img/tunak.gif");
		ret.add(new SelectItem(tunak, "Choisir un acteur"));
		ret.add(new SelectItem(aamir, "Aamir Khan"));
		ret.add(new SelectItem(karishma, "Karishma Kapoor"));
		
		return ret;
	}

}
