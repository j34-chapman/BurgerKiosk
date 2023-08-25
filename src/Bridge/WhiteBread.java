package Bridge;


//Concrete implementation of the BreadType class
public class WhiteBread extends BreadType {
	
 public WhiteBread(Fillings fillings) {
    super(fillings);
 }

 @Override
 public void buildBurger() {
	 System.out.println("Order recieved for white bread with " + fillings.meatType());
	 System.out.println("Preparing white bread  and " + fillings.meatType());
	 System.out.println("Ready ! white bread with " + fillings.meatType()); 
 }
}
