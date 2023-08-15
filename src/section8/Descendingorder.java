package section8;

import java.util.Arrays;
import java.util.Scanner;

public class Descendingorder {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myinteger = getinteger(5);
        int[] sorting = sortInteger(myinteger);
        printarray(sorting);
    }

    public static int[] getinteger(int number){
        int[] array = new int[number];
        System.out.println("enter "+ number+" integer values:\r");
        for (int i = 0;i < array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" array " + i + " value is "+ array[i]);
        }
    }

    public static int[] sortInteger(int[] array){
        int[] sortarray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0; i< array.length-1; i++){
                if (sortarray[i]<sortarray[i+1]){
                    temp = sortarray[i];
                    sortarray[i] = sortarray[i+1];
                    sortarray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortarray;
    }
}

