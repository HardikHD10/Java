package section3;

public class challenges {
    public static void main(String[] args){
       byte a = 64;
       short b = 1600;
       int c = 2300;
       long d = (50000 + 10 *((int)a +(int)b+c));
       System.out.println(d);

       double pound =200d;
       double convert = pound * 0.453597237;
       System.out.println("pound into kilogram = "+ convert);

       //challenge2
        int newvalue = 50;
        if (newvalue == 50){
            System.out.println("this is an error");
        }

        // operator challenge
        double variable1 = 20d;
        double variable2 = 80d;
        double variable3 = (variable1+variable2)*100d;
        double variable4 = variable3/40d;
        boolean variable5 = (variable4 == 0)? true : false;
        System.out.println(variable5);
        if (variable5 == false){
            System.out.println("got some remainder!");
        }
    }
}
