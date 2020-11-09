package ob;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
    }
	String oct = Integer.toOctalString(subject.state);
    public void update(){
		    	System.out.println("La valeur du compteur en octale est"+oct);
		    }
}
