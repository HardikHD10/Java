package section5;

import java.util.Scanner;

public class minandmaxchallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int counter = 0;
        boolean first = true;
        System.out.println("enter the number limit :");
        int numlimit = scanner.nextInt();
        while(true){
            System.out.println("enter the no. :");
            boolean isanint = scanner.hasNextInt();

            if(isanint =true) {
                int num = scanner.nextInt();
                counter++;
                if(first){
                    first = false;
                    min = num;
                    max = num;
                }
                if (num>max){
                    max = num;
                }
                if (num<min){
                    min = num;
                }
                if (counter == numlimit){
                    break;
                }
            }
            scanner.nextLine();
         }
        System.out.println("highest number = "+ max+" and miminum number = "+ min);
        scanner.close();
    }
}
