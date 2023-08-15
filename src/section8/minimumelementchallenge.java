package section8;

import java.util.Arrays;
import java.util.Scanner;

public class minimumelementchallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int number){
        int[] array = new int[number];
        System.out.println("enter "+ number + " integer value:\r");
        for(int i = 0; i < array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findmin(int[] array){
        int minvalue = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                if ( array[i] < minvalue) {
                    minvalue = value;
            }
        }
        return minvalue;
    }

    public static void main(String[] args) {
        int[] count = readIntegers(5);
        int minvalue = findmin(count);
        System.out.println("miminum of the array list is " + minvalue);
    }
}
