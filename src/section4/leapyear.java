package section4;

public class leapyear {
    public static void isleapyear(int year) {
        if (year % 4 == 0) {
            if (year % 400 != 0 && (year % 100 == 0)) {
                System.out.println("it is not a leap year!");
            } else {
                System.out.println("it is leap year!");
            }
        } else
            System.out.println("it is not a leap year!");
    }

    public static void main(String[] args) {
        isleapyear(1976);
    }
}