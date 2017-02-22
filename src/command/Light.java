package command;

//receiver
public class Light {

	private boolean isOn = false;
	
	public boolean isOn(){
		return isOn;
	}
	
	public void toggle(){
		if(isOn){
			off();
			isOn = false;
		}
		else{
			on();
			isOn = true;
		}
	}
	
	public void on(){
		System.out.println("The light is on");
	}
	
	public void off(){
		System.out.println("Light is off");
	}
}
