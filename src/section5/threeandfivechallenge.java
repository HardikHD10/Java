package section5;

public class threeandfivechallenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i=1; i<=1000;i++){
            if (i % 15 == 0){
                System.out.println("the number divisible by 3 and 5 : " + i);
                count++;
                sum += i;
                if (count == 5){
                    break;
                }
            }
        }
        System.out.println("sum of the numbers is : "+ sum);
    }
}

