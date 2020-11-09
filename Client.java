package composite;

public class Client {

	public static void main(String[] args) {
		
		Composant item = new Element("Fichier 22", 100);
		
		Composant fichier11 = new Element("Fichier 11", 50);
		Composant fichier12 = new Element("Fichier 12", 50);
		Composant fichier13 = new Element("Fichier 13", 50);
		Composant fichier21 = new Element("Fichier 21", 50);
		Composant fichier31 = new Element("Fichier 31", 50);
		Composant fichier32 = new Element("Fichier 32", 50);
		Composant fichier33 = new Element("Fichier 33", 50);
		
		Composite composite1 = new Composite("Dossier 1");
		Composite composite2 = new Composite("Dossier 2");
		Composite composite3 = new Composite("Dossier 3");
		
		composite1.addComposant(composite2);
		composite1.addComposant(composite3);
		
		composite1.addComposant(fichier11);
		composite1.addComposant(fichier12);
		composite1.addComposant(fichier13);
		
		composite2.addComposant(fichier21);
		composite2.addComposant(item);
		
		composite3.addComposant(fichier31);
		composite3.addComposant(fichier32);
		composite3.addComposant(fichier33);
		
		composite2.removeComposant(item);

		composite1.opperation(); 
	}

}
