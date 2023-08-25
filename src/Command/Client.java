//Client code
package Command;

public class Client {
    public static void main(String[] args) {
        BurgerReciever burger = new BurgerReciever();

        // Create a command to set bread type to plain roll
        BurgerCommand breadCommand = new PlainRollBreadCommand(burger);
        // Create a command to add spicy meat and cheese filling
        BurgerCommand fillingCommand = new SpicyMeatAndCheeseFillingCommand(burger);

        Kiosk kiosk = new Kiosk();
        // Order the burger with plain roll bread type and spicy meat and cheese filling
        kiosk.orderBurger(breadCommand);
        kiosk.orderBurger(fillingCommand);

        // Print the burger details
        System.out.println(burger.buildBurger()); // Output: Order received for Plain Roll with Spicy Meat and Cheese filling
    }
}
