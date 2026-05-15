package behavioural.iterator.musicplaylist;

import behavioural.iterator.musicplaylist.concretecollection.Playlist;
import behavioural.iterator.musicplaylist.iterator.Iterator;

public class MusicClass {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Shape of You");
        playlist.addSong("Bohemian Rhapsody");
        playlist.addSong("Blinding Lights");

        Iterator<String> iterator = playlist.createIterator();

        System.out.println("Now Playing:");
        while (iterator.hasNext()) {
            System.out.println(" 🎵 " + iterator.next());
        }
    }
}
