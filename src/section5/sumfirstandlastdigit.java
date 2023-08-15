package section5;

public class sumfirstandlastdigit {
    public static int firstandlastdigitsum(int number){
        if(number<0){
            return -1;
        }
        int total,reversednumber =0,lastdigit,r;
        lastdigit = number % 10;
        while(number>0){
            r = number % 10;
            reversednumber = (reversednumber *10)+r;
            number /=10;
        }
        int firstdigit = reversednumber %10;
        return total = firstdigit+lastdigit;
    }

    public static void main(String[] args) {
        System.out.println(firstandlastdigitsum(252));
        System.out.println(firstandlastdigitsum(257));
        System.out.println(firstandlastdigitsum(0));
        System.out.println(firstandlastdigitsum(4));
        System.out.println(firstandlastdigitsum(-7));
    }
}
