package ob;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Subject compteur= new Subject();
         BinaryObserver dispo1= new BinaryObserver();
         OctalObserver dispo2= new OctalObserver();
         HexaObserver dispo3= new HexaObserver();
         
         compteur.attach(dispo1);
         compteur.attach(dispo2);
         compteur.attach(dispo3);

         for(int i=0; i< 59; i++) {
        	 compteur.setstate();
        	 compteur.getstate();
         }
;	}

}
