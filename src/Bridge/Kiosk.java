package Bridge;

//Client code for making a sandwichOrder

public class Kiosk {
    
    public static void main(String[] args) {
    	
	
		Fillings meat = new Meat();
		BreadType roll = new PlainRoll(meat);
		roll.buildBurger(); 
		
		Fillings spicymeat = new SpicyMeat();
		BreadType roll1 = new PlainRoll(spicymeat);
		roll1.buildBurger(); 
		
		Fillings veg = new Veggie();
		BreadType granaryroll = new GranaryRoll(veg);
		granaryroll.buildBurger(); 
		
		Fillings vegan = new Vegan();
		BreadType whiteBread = new WhiteBread(vegan);
		whiteBread.buildBurger(); 
    	
    	
    	
    }
}



