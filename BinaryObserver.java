package ob;
import java.util.Observer;

public class BinaryObserver implements Observer {
	 Observable subject;
     public BinaryObserver(Observable obs){
	      this.subject = obs;
	      Subject.addObserver(this);
	 }
	 public void update(Observable obs,Object arg){
		    if (obs instanceof Subject) {
		    Subject sujet=(Subject)obs;
		    this.state= sujet.getstate();
            System.out.println("La valeur du compteur en binaire est"+Integer.toBinaryString(state););
	        }
	 }
}
