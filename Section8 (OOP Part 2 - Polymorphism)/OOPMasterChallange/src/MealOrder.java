public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.00);
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.5);
    }

    public double getTotalPrice() {
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}

class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        // the %20s stands for 20 charackter string,
        // thie %6.2 defines the charackters before and after the komma
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

}

class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("Topping", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("Topping", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("Topping", extra3, getExtraPrice(extra3));
    }

    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }

}