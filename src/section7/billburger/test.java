package section7.billburger;

public class test {
    public static void main(String[] args) {
        HamBurger hamburger = new HamBurger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizehamburge());

        Healthyburger healthyBurger = new Healthyburger("","Bacon", 5.67,"");
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizehamburge());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
