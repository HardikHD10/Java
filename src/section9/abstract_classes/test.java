package section9.abstract_classes;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("YORKS");
        dog.breathe();
        dog.eat();

        parrot parrot = new parrot("australian ringneck");
        parrot.fly();
        parrot.breathe();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
