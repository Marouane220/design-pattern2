package ob;

public class HexaObserver extends Observer {
     public HexaObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	 }
	 String hex = Integer.toHexString(subject.state);
	 public void update(){
	    	System.out.println("La valeur du compteur en binaire est"+hex);
	    }
}
