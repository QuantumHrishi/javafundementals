@FunctionalInterface
interface CookingStyle {
    void cook(String pizzaName);
}


public class PizzaShop {

    // This method takes a "cooking instruction" (a lambda)
    static void preparePizza(String name, CookingStyle style) {
        System.out.println("Starting to prepare: " + name);
        style.cook(name);  // Use the lambda passed in
        System.out.println("Done!\n");
    }

    public static void main(String[] args) {
        // Lambda 1: Simple style
        preparePizza("Margherita", n -> System.out.println("Baking " + n + " with cheese only"));

        // Lambda 2: Fancy style
        preparePizza("Veggie", n -> System.out.println("Grilling " + n + " with olives and capsicum"));

        // Lambda 3: Custom style
        CookingStyle spicyStyle = (n) -> System.out.println("Making " + n + " super spicy!");
        preparePizza("Pepperoni", spicyStyle);
    }
}


