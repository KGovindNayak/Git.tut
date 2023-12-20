package inheritance;

class SmartHomeDevice
{
	private String type;
	private boolean status;
	
	
	public SmartHomeDevice(String type,boolean status)
	{
		this.type=type;
		this.status=status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public void turnOn()
	{
		
			System.out.println("Light is turned on.");
		
	}
	public void turnOff()
	{
		System.out.println("Light is turned off.");
	}
	
}
class LightDevice extends SmartHomeDevice
{
	public LightDevice(String type,boolean status)
	{
		super(type,status);
	}
	public void dim(int brightness)
	{
		System.out.println("Light brightness is "+brightness+"%");
	}
}
class ThermostatDevice extends SmartHomeDevice
{
	public ThermostatDevice(String type,boolean status)
	{
		super(type,status);
	}
	public void setTemparature(int temparature)
	{
		System.out.println("Thermostat is turned on.");
		System.out.println("Thermostat temparature is set to "+temparature+"'C");
	}
	public void thermostatOff()
	{
		System.out.println("Thermostat is turned off.");
	}
}

public class MainSmart1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LightDevice ld=new LightDevice("buld", true);
		ThermostatDevice ts=new ThermostatDevice("Hh", true);
		ld.turnOn();
		ld.dim(50);
		ts.setTemparature(22);
		ld.turnOff();
		ts.thermostatOff();
	}

}
