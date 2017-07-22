package observer;

public class Observable {
	
    boolean change = false;
	
	protected void addObserver(){}
	
	protected void removeObserver(){}
	
	protected void notifyObservers(){}
	
	protected void setChanged() {
		change = true;
	}
	
	protected void clearChanged() {
		change = false;
	}
	
	protected boolean hasChanged() {
		return change;
	}

}
