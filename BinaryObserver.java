package ob;

public class BinaryObserver extends Observer {
     public BinaryObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	 }
	 String bin = Integer.toBinaryString(subject.state);
	 public void update(){
	    	System.out.println("La valeur du compteur en binaire est"+bin);
	    }
}
