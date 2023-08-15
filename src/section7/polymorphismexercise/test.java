package section7.polymorphismexercise;

public class test {
    public static void main(String[] args) {
        car car = new car(8,"base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        mitsubishi mitsubishi = new mitsubishi(8 ,"outlander vrx 4wd");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Holden Holden = new Holden(8,"base car");
        System.out.println(Holden.startEngine());
        System.out.println(Holden.accelerate());
        System.out.println(Holden.brake());

        ford ford = new ford(8,"base car");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
