package se.mosh.elmira.generics;

//T --> type or template  (type parameter for this class)
//E --> element (implement a class act as a collection)

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{   //T type of object we want to store here
    public T[] items = (T[]) new Object[10]; //cast the result to T Array.
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {   //rerun type is Iterator object
        return null;
    }
}
