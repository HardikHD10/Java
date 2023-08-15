package section5;

public class numberpalindrome {
    public static void main(String[] args) {
        System.out.println(ispalindrome(3553));
    }

    public static boolean ispalindrome(int num) {
        int reveresednum = 0, remainder;
        if (num < 0) {
            num = 0 - num;
        }
        int originaln = num;
        while (num > 0) {
            remainder = num % 10;
            reveresednum = (reveresednum * 10) + remainder;
            num /= 10;
        }
        if (originaln == reveresednum) {
            return true;
        } else {
            return false;
        }
    }
}


