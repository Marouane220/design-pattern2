package ob;

public abstract class Observer {

    protected Subject subject;
    
    public void update(){
    	System.out.println("La valeur du compteur est changée ");
    }
}
