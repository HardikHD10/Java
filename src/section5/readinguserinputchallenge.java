package section5;

import java.util.Scanner;

public class readinguserinputchallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0,counter = 0;
        while(true){
            int order = counter + 1;
            System.out.println("enter the no.#" + order + " :");

            boolean isanint = scanner.hasNextInt();
            if(isanint =true)
            {
                int number = scanner.nextInt();
                counter++;
                sum+= number;
                if (counter==10){
                    break;
                }
            }
            else
            {
                System.out.println("invalid input");
            }
            scanner.nextLine();

        }
        System.out.println("sum = "+sum);
        scanner.close();
    }
}
