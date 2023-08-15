package section5;

import java.util.Scanner;

public class inputcalculator {
    public static void main(String[] args) {
        inputthenprintsumandaverage();
    }
    public static void inputthenprintsumandaverage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of numbers you want to enter: ");
        int numsize = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < numsize;i++)
        {
            System.out.println("Enter the number : "+(i+1));
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("sum of all the entered numbers is : "+sum);
        double average = (double) sum/numsize;
        System.out.println("Average of all the numbers = "+ average);
        scanner.close();
    }
}
