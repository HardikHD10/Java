package section7.billburger;

public class DeluxeBurger extends HamBurger{
    public DeluxeBurger() {
        super("deluxe","sausage and bacon", 14.50, "white");
        super.addHamburgerAddition1("chips",19.90);
        super.addHamburgerAddition2("drinks",19.90);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot add additional items to a delux burger!");;
    }

    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot add additional items to a delux burger!");;
    }


    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot add additional items to a delux burger!");;
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot add additional items to a delux burger!");;
    }

    public double itemizeHamburger() {
        return 14.50+19.90+19.90;
    }
}


