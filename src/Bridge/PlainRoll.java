package Bridge;

//Concrete implementation of the BreadType class
public class PlainRoll extends BreadType {
	
 public PlainRoll(Fillings fillings) {
     super(fillings);
 }

 @Override
 public void buildBurger() {
     System.out.println("Order recieved for plain roll with " + fillings.meatType());
     System.out.println("Preparing plain roll  and " + fillings.meatType());
    System.out.println("Ready ! plain roll with " + fillings.meatType()); 
 }
}