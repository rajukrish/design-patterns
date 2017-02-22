package mediator;

public class MediatorDemo {

	public static void main(String[] args){
		
		Mediator mediator = new Mediator();
		
		Light bedRoomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		
		mediator.registerLight(bedRoomLight);
		mediator.registerLight(kitchenLight);
		
		Command turnOnAllLightsCommand = new turnOnAllLightsCommand(mediator);
		
		Command turnOffAllLightsCommand = new turnOffAllLightsCommand(mediator);
		
		turnOnAllLightsCommand.execute();
		
		turnOffAllLightsCommand.execute();
	}
}
