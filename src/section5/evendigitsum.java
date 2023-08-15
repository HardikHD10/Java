package section5;

public class evendigitsum {
    public static int evendigitsumis(int num){
        if(num < 0){
            return -1;
        }
        int r;
        int sum = 0;
        while(num >0){
            r = num % 10;
            if (r % 2 == 0) {
            sum += r;
            }
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evendigitsumis(123456789));
        System.out.println(evendigitsumis(252));
        System.out.println(evendigitsumis(-22));
    }
}
