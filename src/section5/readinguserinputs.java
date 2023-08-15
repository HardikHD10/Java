package section5;

import java.util.Scanner;

public class readinguserinputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your year of birth: ");
        boolean hasnextint = scanner.hasNextInt();
        if (hasnextint) {
            int yearofbirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Your Name: ");
            String name = scanner.nextLine();
            int age = (2021 - yearofbirth);
            if (age >= 0 && age <= 100) {
                System.out.println(" your age is " + age);
                System.out.println("Your name is " + name);
            } else {
                System.out.println("invalid input pf year!");
            }
        }
        else
            {
                System.out.println("not a valid input!");
            }
            scanner.close();
        }
    }

