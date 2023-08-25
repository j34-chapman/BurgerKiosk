package Command;

public class WhiteBreadCommand implements BurgerCommand {
	
	private BurgerReciever burgerReciever;
	
	//Constructor

	@Override
	public void execute() {
		burgerReciever.setBreadType("White Bread");
		
	}

}

