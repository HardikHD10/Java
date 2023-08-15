package section5;

public class whileanddowhile {
    public static boolean isevennumber(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isevennumber(5));
        int nd = 0;
        int number =4;
        int finishnumber = 20;
        while(number <= finishnumber){
            number++;
            if(!isevennumber(number)){
                continue;
            }
            nd++;
            System.out.println("even number : "+ number);
            if (nd == 5) {
                break;
            }
        }
    }
}
