package section4;

public class DecimalComparator{
    public static boolean areequalbythreedecimalplaces(double num1,double num2) {
        double n1 = Math.round(num1*1000);
        double n2 = Math.round(num2*1000);
        if ( n1 == n2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       System.out.println(areequalbythreedecimalplaces(-3.175,-3.176));
    }
}
