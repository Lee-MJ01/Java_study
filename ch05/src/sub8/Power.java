package sub8;

public class Power implements Socket{

	private Bulb bulb;
	
	public Power(Bulb b) {
		this.bulb = b;
	}
	
	
	
	@Override
	public void swichOn() {
		bulb.lightOn();
	}

	@Override
	public void swichOff() {
		bulb.lightOff();
	}
	
}
