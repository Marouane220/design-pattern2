package ob;

import java.util.ArrayList;
import java.util.List;


public class Subject {
 int state;
 List<Observer> observers = new ArrayList<>();
 
 public int getstate(){
	 return state;
 }
 
 public void setstate() {
	state=(state+1);
	notifyAllObservors();
 }
 
 public void attach(Observer obs){
	 observers.add(obs);
 }
 
 public void notifyAllObservors(){
	 for (Observer obs : observers) {
		 obs.update();
	 }
 }
}
