package section8.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        LinkedList<String> placestovisit = new LinkedList<String>();
        addinorder("Sydney",placestovisit);
        addinorder("Melbourne",placestovisit);
        addinorder("Brisbane",placestovisit);
        addinorder("Perth",placestovisit);
        addinorder("Canberra",placestovisit);
        addinorder("Adelaide",placestovisit);
        addinorder("Darwin",placestovisit);
        addinorder("Darwin",placestovisit);


//        placestovisit.add("Sydney");
//        placestovisit.add("Melbourne");
//        placestovisit.add("Brisbane");
//        placestovisit.add("Perth");
//        placestovisit.add("Canberra");
//        placestovisit.add("Adelaide");
//        placestovisit.add("Darwin");

        printList(placestovisit);

        placestovisit.add(1,"alice springs");
        printList(placestovisit);

        placestovisit.remove(4);
        printList(placestovisit);

        visit(placestovisit);
    }

        private static void printList(LinkedList <String> linkedList){
            Iterator<String> i = linkedList.iterator();
            while (i.hasNext()){
                System.out.println("Now visiting "+i.next());
        }
            System.out.println("=========================");
    }

    private static boolean addinorder(String newcity, LinkedList<String> linkedList){
        ListIterator<String> stringlistiterator = linkedList.listIterator();

        while (stringlistiterator.hasNext()){
            int comparison = stringlistiterator.next().compareTo(newcity);
            if(comparison == 0){
                // equal do not add
                System.out.println(newcity + " is already included as destination");
                return false;
            }
            else  if (comparison > 0){
                // new City should appear before this one
                // Brisbane ---> Adelaide
                stringlistiterator.previous();
                stringlistiterator.add(newcity);
                return true;
            }
            else if(comparison<0){
                // move on to next city
            }
        }
        stringlistiterator.add(newcity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingforward= true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("no cities in the itenary");
            return;
        }else{
            System.out.println("now visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                {
                    System.out.println("Holiday over!");
                    quit = true;
                    break;
                }
                case 1: {
                    if (!goingforward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingforward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now visiting " + listIterator.next());
                    } else{
                        System.out.println("reached the end of the list");
                        goingforward = false;
                    }
                    break;
                }
                case 2:
                {
                    if(goingforward){
                        if(listIterator.hasPrevious()){
                            listIterator.hasPrevious();
                        }
                        goingforward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now visiting "+ listIterator.previous());
                    }else{
                        System.out.println("we are at the start of list");
                        goingforward = true;
                    }
                    break;
                }
                case 3:
                    printMenu();
            }
        }
    }
    private static void printMenu(){
        System.out.println("available actions:\npress");
        System.out.println("0 --> quit\n"+"1 --> go to next city\n"+"2--> go to previous city\n"+"3 --> print menu options");
    }
}
