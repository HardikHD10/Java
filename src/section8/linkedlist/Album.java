package section8.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String Artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        Artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addsong(String title,double duration){
        if(findsong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findsong(String title){
        for (Song checkedsong : this.songs){
            if(checkedsong.getTitle().equals(title)){
                return checkedsong;
            }
        }
        return null;
    }

    public boolean addtoplaylist(int tracknumber, LinkedList<Song> playlist){
        int index = tracknumber - 1;
        if ((index >= 0)&& (index <=this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have a track "+ tracknumber);
        return false;
    }

    public boolean addtoplaylist(String title,LinkedList<Song> playlist){
        Song checkedsong = findsong(title);
        if (checkedsong != null){
            playlist.add(checkedsong);
        }
        System.out.println("the song "+ title +" is not in this album");
        return false;
    }


}
