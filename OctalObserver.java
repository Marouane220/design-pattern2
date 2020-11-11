package ob;
import java.util.Observer;

public class OctalObserver extends Observer {
	Observable subject;
    public OctalObserver(Observable obs){
	      this.subject = obs;
	      Subject.addObserver(this);
	 }
	 public void update(Observable obs,Object arg){
		    if (obs instanceof Subject) {
		    Subject sujet=(Subject)obs;
		    this.state= sujet.getstate();
	    	System.out.println("La valeur du compteur en octale est" +Integer.toOctalString(state));
	        }
	 }

