package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable ob) {
		this.observable = ob;
		observable.addObserver(this);
	}
	
	public void update(Observable ob, Object arg) {
		if (ob instanceof WeatherData) {
			WeatherData w = (WeatherData)ob;
			this.temperature = w.getTemperature();
			this.humidity = w.getHumidity();
			display();		
		}
	}
	

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("current conditions: "+ temperature+ "F degrees and "+humidity+"% humidity");
		
	}


}
