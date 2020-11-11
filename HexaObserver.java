package ob;
import java.util.Observer;

public class HexaObserver extends Observer {
	 Observable subject;
	    public HexaObserver(Observable obs){
		      this.subject = obs;
		      Subject.addObserver(this);
		 }
		 public void update(Observable obs,Object arg){
			    if (obs instanceof Subject) {
			    Subject sujet=(Subject)obs;
			    this.state= sujet.getstate();
		    	System.out.println("La valeur du compteur en Hexadecimale est" +Integer.toHexString(subject.state));
		        }
		 }

}
