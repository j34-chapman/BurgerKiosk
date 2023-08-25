package Command;

public class PlainRollCommand implements BurgerCommand {
	
	private BurgerReciever burgerReciever;
	
	//Constructor

	@Override
	public void execute() {
		burgerReciever.setBreadType("Plain roll");
		
	}

}
