package section9.challenge1;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        player tim = new player("tim",10,15);
        System.out.println(tim.toString());
        saveobjects(tim);

        tim.setHitpoints(8);
        System.out.println(tim);
        tim.setWeapon("stormbringer");
        saveobjects(tim);
        //loadobjects(tim);
        System.out.println(tim);

        Isaveable werewolf = new Monster("werewolf",20,40);
        System.out.println(((Monster)werewolf).getStrength());
        saveobjects(werewolf);
        loadobjects(werewolf);
    }

    public static ArrayList<String> readvalues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("choose\n"+"1 to enter a string\n"+" 0 to quit\n");

        while (!quit){
            System.out.println("choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0: {
                    quit = true;
                    break;
                }
                case 1 :
                {
                    System.out.println("enter a string : ");
                    String stringinput = scanner.nextLine();
                    values.add(index,stringinput);
                    index++;
                    break;
                }
            }
        }
        return values;
    }

    public static void saveobjects(Isaveable objectstosave){
        for (int i = 0; i < objectstosave.write().size();i++){
            System.out.println("Saving "+ objectstosave.write().get(i)+ " to storage device");
        }
    }

    public static void loadobjects(Isaveable objectstoload){
        ArrayList<String> values = readvalues();
        objectstoload.read(values);
        }
}

