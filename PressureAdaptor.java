
package adaptorsensor;

import sensor.PressureSensor;

public class PressureAdaptor implements Adaptor{
	private PressureSensor p;
	
	public PressureAdaptor(){
		p = new PressureSensor();
	}

	@Override
	public double getValue() {
		return p.readValue();
	}

	@Override
	public String getStatus() {
		return p.getReport();
	}

	@Override
	public String getName() {
		return p.getSensorName();
	}
	
}
