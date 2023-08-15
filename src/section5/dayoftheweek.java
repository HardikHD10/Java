package section5;

public class dayoftheweek {
    public static void printdayoftheweek(int day){
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter a valid input!");
        }
    }

    public static void main(String[] args) {
        printdayoftheweek(0);
        printdayoftheweek(1);
        printdayoftheweek(2);
        printdayoftheweek(3);
        printdayoftheweek(4);
        printdayoftheweek(5);
        printdayoftheweek(6);
        printdayoftheweek(7);

    }
}
