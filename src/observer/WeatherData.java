package observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){}


	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasuremenets(float tem, float hum, float pre) {
		this.temperature = tem;
		this.humidity = hum;
		this.pressure = pre;
		measurementsChanged();
	}
	
}
