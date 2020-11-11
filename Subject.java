package ob;

import java.util.ArrayList;

import java.util.List;
import java.util.Observable;


public class Subject extends observable {
 int state;
 
 public int getstate(){
	 return state;
 }
 
 public void setstate() {
	state=(state+1)%60;
	setchange();
	notifyAllObservors();
 }
 

}


//Ha ach drt ana hhh

public class Subject extends Observable {
	
    private int state;

    public Subject(int val) {
		this.setState(val);
	}

    public int getState() {
    	return state;
	}

    public void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }
	try {
			while (!Thread.currentThread().isInterrupted()) {
				this.setState((this.getState() + 1) % 60);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			}
}
