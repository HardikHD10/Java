package section9.abstract_classes;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not very good at that, i can go for swim instead");
    }
}

