package Command;

public class VeggieCommand implements BurgerCommand {
	
	private BurgerReciever burgerReciever;
	
	//Constructor

	@Override
	public void execute() {
		burgerReciever.addFilling("Veggie");
		
	}

}