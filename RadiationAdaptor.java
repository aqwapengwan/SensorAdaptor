
package adaptorsensor;

import sensor.RadiationSensor;

public class RadiationAdaptor implements Adaptor{
	private RadiationSensor r;
	
	public RadiationAdaptor(){
		r = new RadiationSensor();
	}

	
	@Override
	public double getValue() {
		return r.getRadiationValue();
	}

	@Override
	public String getStatus() {
		return r.getStatusInfo();
	}

	@Override
	public String getName() {
		return r.getName();
	}
	
}
