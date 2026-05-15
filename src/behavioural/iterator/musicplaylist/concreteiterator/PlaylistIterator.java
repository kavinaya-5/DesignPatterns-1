package behavioural.iterator.musicplaylist.concreteiterator;

import behavioural.iterator.musicplaylist.concretecollection.Playlist;
import behavioural.iterator.musicplaylist.iterator.Iterator;

public class PlaylistIterator implements Iterator<String> {
    private final Playlist playlist;
    private int index = 0;

    public PlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return index < playlist.getSize();
    }

    @Override
    public String next() {
        return playlist.getSongAt(index++);
    }
}