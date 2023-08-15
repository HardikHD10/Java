package section7.composition;

import section7.example1.*;

public class test {
    public static void main(String[] args) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("long",4,3,2,1);
        Lamp lamp = new Lamp("ROUNDED",false,7);
        Bedroom bedroom = new Bedroom("hardik",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.getLamp().turnOn();
        bedroom.makeBed();
    }
}
