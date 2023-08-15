package section8;


import java.util.Arrays;

public class reversearraychallenge {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        System.out.println("array before : "+ Arrays.toString(array));
        reverse(array);
        System.out.println("reversed array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("reversed reversed array = " + Arrays.toString(array));
    }

    public static void reverse(int[] array){
        int maxindex = array.length - 1;
        int halflength = array.length/2;

        for(int i = 0; i < halflength; i++){
            int temp =array[i];
            array[i] = array[maxindex - i];
            array[maxindex - i] = temp;
        }
    }
}
