package section4;

public class EqualityPrinter {
    public static void printEqual(int n1,int n2,int n3){
        if (n1<0||n2<0||n3<0){
            System.out.println("Invalid input!");
        }
        else if (n1 == n2 && n2 == n3){
            System.out.println("All numbers are equal");
        }
        else if(n1 != n2 && n1 != n3 && n2 != n2){
            System.out.println("all numbers are different");
        }
        else{
            System.out.println("neither all are equal nor different");
            }
        }

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,3,2);
    }
}
