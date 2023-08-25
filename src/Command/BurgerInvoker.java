package Command;

import java.util.ArrayList;
import java.util.List;

public class BurgerInvoker {
	
	private final List <BurgerCommand> burgerCommands = new ArrayList <>();
	
	public void executeCommand(BurgerCommand burgerCommand) {
		burgerCommands.add(burgerCommand);
		 burgerCommand.execute();
	}

}
