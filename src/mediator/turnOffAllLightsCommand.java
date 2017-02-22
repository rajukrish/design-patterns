package mediator;

public class turnOffAllLightsCommand implements Command {

	private Mediator med;
	
	public turnOffAllLightsCommand(Mediator med){
		this.med = med;
	}
	
	@Override
	public void execute() {
			med.turnOffAllLights();
	}

}
