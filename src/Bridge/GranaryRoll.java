package Bridge;

//Concrete implementation of the BreadType class
public class GranaryRoll extends BreadType {
	
 public GranaryRoll(Fillings fillings) {
     super(fillings);
 }

 @Override
 public void buildBurger() {
     System.out.println("Order recieved for granary roll with " + fillings.meatType());
     System.out.println("Preparing granary roll  and " + fillings.meatType());
     System.out.println("Ready ! granary roll with " + fillings.meatType()); 
 }
}

