package section5;

public class numberinwords {
    public static void printnumberinwords(int num){
        switch (num){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static void main(String[] args) {
        printnumberinwords(0);
        printnumberinwords(1);
        printnumberinwords(2);
        printnumberinwords(8);
        printnumberinwords(-1);
    }
}
