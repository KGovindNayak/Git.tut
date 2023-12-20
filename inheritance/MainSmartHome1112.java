package inheritance;

class smartHomeDeviceex
{
	private String type;
	private boolean status;
	
	
	public smartHomeDeviceex(String type,boolean status)
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
		
			System.out.println(type+" is turned on.");
		
	}
	public void turnOff()
	{
		System.out.println(type+" is turned off.");
	}
	
}
class VoiceAssistantIntegration extends smartHomeDeviceex
{
	public VoiceAssistantIntegration(String type,boolean status)
	{
		super(type,status);
	}
	public void executionVoiceCommand(String command)
	{
		if(command=="turn on")
		{
			super.turnOn(); 
		}
		else if(command=="turn off")
		{
			super.turnOff();
		}
		else if(command=="dim")
		{
			System.out.println("Adjusting brightness...");
			
		}
		else if(command=="set Temparature")
		{
			
			System.out.println("Setting temparature...");
		}else
		{
			
			System.out.println("command is not recognized.");
		}
		
	}
}

public class MainSmartHome1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoiceAssistantIntegration vip=new VoiceAssistantIntegration("voice Assistant", false);
		vip.executionVoiceCommand("turn on");
		vip.executionVoiceCommand("set Temparature");
		vip.executionVoiceCommand("dim");
		vip.executionVoiceCommand("turn off");
	}

}
