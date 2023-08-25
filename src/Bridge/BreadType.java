package Bridge;

//The refined abstraction level
public abstract class BreadType {
	
//Bridge between the two classes
 protected Fillings fillings;

 public BreadType(Fillings fillings) {
     this.fillings = fillings;
 }

 public void setFillings(Fillings fillings) {
     this.fillings = fillings;
 }

 
 public abstract void buildBurger();




 
}
