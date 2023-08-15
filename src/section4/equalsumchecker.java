package section4;

public class equalsumchecker {
    public static boolean hasequalsum(int n1,int n2, int n3){
    if (n1+n2 == n3){
        return true;
    }
    else
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasequalsum(1,1,1));
        System.out.println(hasequalsum(1,1,2));
    }
}
