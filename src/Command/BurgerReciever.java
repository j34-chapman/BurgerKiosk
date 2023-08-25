package Command;

import java.util.ArrayList;
import java.util.List;

//Reciever Class
public class BurgerReciever {
	
	private String breadType;
	private List <String> fillings = new ArrayList<>(); //Allows for multiple fillings in a singular breadType
	
	
	public void addFilling(String filling) {
        fillings.add(filling); // adds a filling to the list of fillings
    }
	
	
	public void setBreadType(String breadType) {
	    this.breadType = breadType; // sets the bread type
	} 

	
	
	
	public String buildBurger() {
	   return "Order recieved for  " + breadType + " with " + String.join("," , fillings)  + " filling"  + "\n" +
			   "Preparing " + breadType + " and" +  String.join("," , fillings) + " filling " + "\n" +
			   "Ready! " + breadType + " with " +  String.join("," , fillings) + " filling";
	 }
	
		/*
		 * A receiver is an object that performs a set of cohesive actions. It's the
		 * component that performs the actual action when the command's execute() method
		 * is called.
		 */



}
