package ob;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Subject compteur= new Subject();
        new BinaryObserver(compteur);
        new OctalObserver(compteur);
        new HexaObserver(compteur);

        compteur.setstate();
;	}

}
