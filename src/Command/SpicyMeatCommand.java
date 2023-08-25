package Command;

public class SpicyMeatCommand implements BurgerCommand {
	
	private BurgerReciever burgerReciever;
	
	//Constructor

	@Override
	public void execute() {
		burgerReciever.addFilling("Spicy Meat");
		
	}

}