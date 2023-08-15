package section5;

public class lastdigitchecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }

        int compareVal1 = num1 % 10;
        int compareVal2 = num2 % 10;
        int compareVal3 = num3 % 10;

        if((compareVal1 == compareVal2) || (compareVal1 == compareVal3) ||
                (compareVal2 == compareVal3)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int num1) {
        if(num1 < 10 || num1 > 1000) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(989,99,999));
    }
}

