package se.mosh.elmira.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");

        // collection.remove("a");
        // collection.clear();
        // System.out.println(collection.size());
        //System.out.println(collection);
        // System.out.println(collection.isEmpty());

        // var containsA =  collection.contains("a");
        // System.out.println(containsA);

       // var objectArray = collection.toArray();  //Object[] objectArray   (pass no arguments)
       // var stringArray = collection.toArray(new String[0]);   //String[] stringArray
       // stringArray[0].toLowerCase();

        //compare to collections or equality:
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other); //false
        System.out.println(collection.equals(other));  //true


    }
}
