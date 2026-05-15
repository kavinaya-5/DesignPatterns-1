package behavioural.iterator.musicplaylist.iterablecollection;

import behavioural.iterator.musicplaylist.iterator.Iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}