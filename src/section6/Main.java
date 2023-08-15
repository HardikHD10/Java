package section6;

public class Main {
    public static void main(String[] args) {
        classes porsche = new classes();
        classes holden = new classes();
        System.out.println("model is "+ porsche.getModels());
        porsche.setModels("Carrera");
        System.out.println("model is "+ porsche.getModels());

        // new
        outlander outlander = new outlander("outlander","4wd",5,5,6,false,36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);

    }
}
