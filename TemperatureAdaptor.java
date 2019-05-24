
package adaptorsensor;

import sensor.TemperatureSensor;


public class TemperatureAdaptor implements Adaptor{
	private TemperatureSensor t;
	
	public TemperatureAdaptor(){
		t = new TemperatureSensor();
	}
	
	@Override
	public double getValue() {
		 return t.senseTemperature();
	}

	@Override
	public String getStatus() {
		return t.getTempReport();
	}

	@Override
	public String getName() {
		return t.getSensorType();
	}
	
}
