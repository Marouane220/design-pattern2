package composite;

public abstract class Composant {
	protected String nom;
	protected int taille;
	protected int niveau;
	
	public abstract void opperation();
	
	public abstract int showSize();
	
	public Composant(String nom) {
		this.nom = nom;
	}
	
	public int getSize(int taille) {
		return taille;
	}

}
