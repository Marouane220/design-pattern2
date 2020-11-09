package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant {
	
	protected List<Composant> composants;
	
	public Composite(String nom) {
		super(nom);
		this.composants = new ArrayList<Composant>();
	}


	@Override
	public void opperation() {
		String tab ="";
		for(int i=0; i< niveau; i++) tab += "----";
		System.out.println(tab + "Composite " + nom + " taille totale du dossier " + showSize() + " octets");
		for (Composant c:composants ) {
			c.opperation();
		}
	}
	


	public void addComposant(Composant c){
		c.niveau = this.niveau + 1;
		composants.add(c);
	}
	
	
	public void removeComposant(Composant c) {
		composants.remove(c);
	}
	
	@Override
	public int showSize() {
		int taille = 0 ;
		for(Composant c: composants) {
			taille += c.showSize();
		} 
		return taille;
	}
	
}
