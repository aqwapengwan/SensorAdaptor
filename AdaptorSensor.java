
package adaptorsensor;

public class AdaptorSensor {
	
	public static void main(String[] args) {
		Adaptor a = new TemperatureAdaptor();
		Adaptor b = new PressureAdaptor();
		Adaptor c = new RadiationAdaptor();
		GUI app = new GUI(a, b, c);
	}
	
}
	