package section9.challenge2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private Songlist songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new Songlist();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title,duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
      Song checkedSong = this.songs.findSong(trackNumber);
      if (checkedSong!= null){
          playList.add(checkedSong);
          return true;
      }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class Songlist{
        private ArrayList<Song> songs;

        public Songlist(){
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song){
            if (songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int tracknumber){
            int index = tracknumber-1;
            if ((index>= 0) && (index < songs.size())){
                return songs.get(index);
            }
            return null;
        }
    }
}
