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
