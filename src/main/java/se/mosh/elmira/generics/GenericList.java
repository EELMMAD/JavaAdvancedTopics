package se.mosh.elmira.generics;

//T --> type or template  (type parameter for this class)
//E --> element (implement a class act as a collection)

public class GenericList<T> {   //T type of object we want to store here
    private T[] items = (T[]) new Object[10]; //cast the result to T Array.
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}
