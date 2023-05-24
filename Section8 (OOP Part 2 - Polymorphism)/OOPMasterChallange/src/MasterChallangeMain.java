public class MasterChallangeMain {
    public static void main(String[] args) {
        // Item coke = new Item("drink", "coke", 1.50);
        // coke.printItem();
        // coke.setSize("LARGE");
        // coke.printItem();

        // Burger burger = new Burger("regular", 4.00);
        // burger.addToppings("bacon", "cheese", "mayo");
        // burger.printItem();

        // MealOrder order = new MealOrder("Big Burger", "coke", "fries");
        // order.addBurgerToppings("bacon", "cheese", "mayo");
        // order.setDrinkSize("large");
        // order.printItemizedList();

        MealOrder deluxeOrder = new MealOrder("deluxe", "fanta", "chili");
        deluxeOrder.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeOrder.setDrinkSize("SMALL");
        deluxeOrder.printItemizedList();
    }
}
