package section5;

public class forloop {
    public static double calculateinterest(double amount, double interestrate){
        return (amount*(interestrate/100));
    }

    public static void main(String[] args) {
        for(int i =2; i < 9;i++){
            System.out.println("10000 at " + i + " % rate of interest = " + String.format("%.2f",calculateinterest(10000,(double) i)));
        }
        for(int i =8; i > 1; i--){
            System.out.println("10000 at " + i + " % rate of interest = " + String.format("%.2f",calculateinterest(10000,(double) i)));
        }
        int count = 0;
        for(int i=2;i <10000;i++){
            if(isprime(i)){
                count ++;
                System.out.println("number "+i+" is a prime number");
                if(count ==1000){
                    break;
                }
            }
        }
    }
    public static boolean isprime(int n){
        if (n ==1) {
            return false;
        }
        for( int i =2; i<n/2; i++){
           if(n%i == 0){
               return false;
           }
        }
        return true;
    }
}
