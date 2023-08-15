package section9.abstract_classes;

public class parrot extends Bird{
    public parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
