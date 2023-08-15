package section8.linkedlist;

import java.util.*;

public class test {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

        Album album = new Album("stormbringer", "deep purple");
        album.addsong("hi there",4.6);
        album.addsong("bcd",4.3);
        album.addsong("cde",5.6);
        album.addsong("def",3.21);
        album.addsong("whatever",6.23);
        albums.add(album);

        album = new Album("linkin park","various artists");
        album.addsong("ads",3.23);
        album.addsong("rfs",4.13);
        album.addsong("dsd",5.21);
        album.addsong("ere",6.21);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addtoplaylist("hi there", playlist);
        albums.get(0).addtoplaylist("whatever", playlist);
        albums.get(0).addtoplaylist("avc", playlist); // doesnot exist
        albums.get(0).addtoplaylist(5,playlist);
        albums.get(1).addtoplaylist(2,playlist);
        albums.get(1).addtoplaylist(3,playlist);
        albums.get(1).addtoplaylist(1,playlist);

        play(playlist);

    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0){
            System.out.println(" no songs in playlist");
            return;
        }else {
            System.out.println("now playing "+ listIterator.next().toString());
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:{
                    System.out.println("playlist complete.");
                    quit = true;
                    break;
                }
                case 1:{
                    if (!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("now playing "+ listIterator.next().toString());
                    }
                    else {
                        System.out.println("we have reached end of the playlist");
                        forward = false;
                    }
                    break;
                }
                case 2:{
                    if (forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now playing "+ listIterator.previous().toString());
                    }
                    else {
                        System.out.println("we have reached start of the playlist");
                        forward = true;
                    }
                    break;
                }
                case 3:{
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("now replaying "+ listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("we are at the start of the list");
                        }
                    }
                    else
                    {
                        if (listIterator.hasNext()){
                            System.out.println("now replaying" +listIterator.next().toString());
                            forward = true;
                        }else
                        {
                            System.out.println("we have reached end of the list");
                        }
                    }
                    break;
                }
                case 4:{
                    printlist(playlist);
                    break;
                }
                case 5:{
                    printmenu();
                    break;
                }
                case 6:{
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing"+ listIterator.next());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("now playing"+ listIterator.previous());
                        }
                        break;
                    }
                }
            }
        }
    }
    private static void printmenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 ---> quit\n"+ "1---> forward\n"+"2 ---> go back\n"+"3 ---> replay the current song\n"+"4 ---> list songs in the playlist\n"+"5 ---> print available actions\n"+"6--> delete current songs\n");
    }

    private static void printlist(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("==============================");
    }
}

