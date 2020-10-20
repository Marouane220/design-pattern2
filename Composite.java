package com.composi;

import java.util.ArrayList;
import java.util.List;
interface Composant{

	void showSize();
}

public class Fichiers implements Composant{
    Long size;
    String name;
    
	public Fichiers(Long size, String name) {
		super();
		this.size = size;
		this.name = name;
	}

	@Override
	public void showSize() {
		
	}

}

class Repertoires implements Composant{
    String name;
    List<Composant> composants = new ArrayList<>();
   
    public Repertoires(String name) {
		super();
		this.name = name;
	}
	public void addComposant(Composant com) {
    	composants.add(com);
    }
	@Override
	public void showSize() {
		System.out.println(name);
		for(Composant c : composants) {
			c.showSize();
		}
	}
	
}
