package Command;

public class FishCommand implements BurgerCommand {
	
	private BurgerReciever burgerReciever;
	
	//Constructor

	@Override
	public void execute() {
		burgerReciever.addFilling("Fish");
		
	}

}