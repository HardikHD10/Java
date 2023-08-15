package section3;

public class operators {
    public static void main(String[] args){
        int result = 12 + 13;
        System.out.println(result);
        int previousresult = result;
        System.out.println(previousresult);
        result = result - 1;
        System.out.println(result);
        result = result * 10;
        System.out.println(result);
        result = result/3;
        System.out.println(result);
        result = result % 3;
        System.out.println(result);

        // result = result+1 example for abbriveiting
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *=10;
        System.out.println(result);

        result /= 4;
        System.out.println(result);

        result -= 2;
        System.out.println(result);
    }
}
