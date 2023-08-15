package section3;

public class strings {
    public static void main(String[] args){
        String mystring = "This is a string";
        System.out.println("I entered"+ " " + mystring +" "+"as a string");
        mystring = mystring + ", and this is more";
        System.out.println(mystring);
        mystring = mystring + " \u00A9 2021";
        System.out.println(mystring);

        String numberstring = "250.55";
        numberstring = numberstring + "49.45";
        System.out.println(numberstring);

        String laststring = "250";
        int acb = 49;
        laststring = laststring + acb;
        System.out.println(laststring);
    }
    }

