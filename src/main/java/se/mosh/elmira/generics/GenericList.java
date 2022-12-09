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
        return new ListIterator(this);    //this is current object, the object that knows how to iterate over generic list
    }

    private class ListIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
