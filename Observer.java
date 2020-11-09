package ob;

public abstract class Observer {

    public Subject subject=new Subject();
    
    public void update(){
    	System.out.println("La valeur du compteur est changée ");
    }
}
