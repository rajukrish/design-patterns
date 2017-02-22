package mediator;

//concrete command
public class turnOnAllLightsCommand implements Command {
	
	private Mediator med;
	
	public turnOnAllLightsCommand(Mediator med){
		this.med = med;
	}
	
	@Override
	public void execute() {
			med.turnOnAllLights();
	}

}
