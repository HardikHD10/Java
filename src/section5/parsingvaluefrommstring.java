package section5;

public class parsingvaluefrommstring {
    public static void main(String[] args) {
        String numberasstring = "2021";
        System.out.println("the year is "+numberasstring);

        int number = Integer.parseInt(numberasstring);
        System.out.println(number);
        number +=1;
        System.out.println(number);

    }
}
