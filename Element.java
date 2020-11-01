package composite;

public class Element extends Composant {
	
	
	public Element(String nom, int taille) {
		super(nom);
		this.taille = taille ;
	}
	
	@Override
	public int showSize() {
		return taille;
	}
	
	@Override
	public void opperation() {
		String tab ="";
		for(int i=0; i< niveau; i++) tab += "--";
		System.out.println(tab + " Element "+ nom + " de taille "+ showSize() + " octets ");
		
	}
}
