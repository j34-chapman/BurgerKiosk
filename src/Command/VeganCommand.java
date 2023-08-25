package Command;

public class VeganCommand implements BurgerCommand {
	
	private BurgerReciever burgerReciever;
	
	//Constructor

	@Override
	public void execute() {
		burgerReciever.addFilling("Vegan");
		
	}

}
