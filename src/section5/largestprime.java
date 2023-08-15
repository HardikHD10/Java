package section5;

public class largestprime {
    public static void main(String[] args) {
        System.out.println(getlargestprime(21));
        System.out.println(getlargestprime(217));
        System.out.println(getlargestprime(0));
        System.out.println(getlargestprime(45));
        System.out.println(getlargestprime(-1));
    }

    public static int getlargestprime(int number) {
        if (number < 2) {
            return -1;
        }
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }
}