package ob;

public class OctalObserver extends Observer {
	String oct = Integer.toOctalString(subject.state);
    public void update(){
		    	System.out.println("La valeur du compteur en octale est"+oct);
		    }
}
