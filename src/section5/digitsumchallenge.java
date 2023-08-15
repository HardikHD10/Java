package section5;

public class digitsumchallenge {
    public static int sumdigits(int num) {
        if (num < 10) {
            return -1;
        }
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumdigits(1));
        System.out.println(sumdigits(125));
        System.out.println(sumdigits(-125));
        System.out.println(sumdigits(32123));

    }
}
