package command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

	public static void main(String[] args) {
		
		Light bedRoomlight = new Light();
		Light kitchenRoomlight = new Light();
		Switch lightSwitch = new Switch();
		
		Command toggleCommand = new ToggleCommand(bedRoomlight);
		
		lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		
		List<Light> lights = new ArrayList<Light>();
		lights.add(kitchenRoomlight);
		lights.add(bedRoomlight);
		
		Command allLightsCommand = new AllLightsCommand(lights);
		
		lightSwitch.storeAndExecute(allLightsCommand);
	}

}
