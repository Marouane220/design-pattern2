package ob;

public class HexaObserver extends Observer {
	 String hex = Integer.toHexString(subject.state);
	 public void update(){
	    	System.out.println("La valeur du compteur en binaire est"+hex);
	    }
}
