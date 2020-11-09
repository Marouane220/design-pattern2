package ob;

public class BinaryObserver extends Observer {
	 String bin = Integer.toBinaryString(subject.state);
	 public void update(){
	    	System.out.println("La valeur du compteur en binaire est"+bin);
	    }
}
