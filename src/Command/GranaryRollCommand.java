package Command;

public class GranaryRollCommand implements BurgerCommand {
	
	private BurgerReciever burgerReciever;
	
	//Constructor

	@Override
	public void execute() {
		burgerReciever.setBreadType("Granary Roll");
		
	}

}
