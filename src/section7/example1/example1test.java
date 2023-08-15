package section7.example1;

public class example1test {
    public static void main(String[] args) {
        wall wall1 = new wall("west");
        wall wall2 = new wall("east");
        wall wall3 = new wall("south");
        wall wall4 = new wall("north");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("modern",4,3,2,1);

        Lamp lamp = new Lamp("classic", 75,false);

        bedroom Bedroom = new bedroom("hardik",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        Bedroom.makebed();
        Bedroom.getLamp().turnOn();
    }
}
