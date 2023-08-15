package section10.generics;

import java.util.ArrayList;

public class BeforeGenerics {
    public static void main(String[] args) {
        ArrayList <Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
//      items.add("hardik");
        printdoubled(items);
    }

    public static void printdoubled(ArrayList <Integer> n){
        for (Object i : n){                                  // updated code : for(int i : n)
            System.out.println((Integer)i * 2);              // updated code : sout(i*2);
        }
    }
}
