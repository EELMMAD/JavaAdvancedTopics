package se.mosh.elmira.collections;

import java.util.*;

public class SetDemo {
    public static void show(){
        /*
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

         */

        /*
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        //we put the collections on set to remove the duplicate.
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);

         */

        Set<String> set1 =
                new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set2 =
                new HashSet<>(Arrays.asList("b", "c", "d"));


        //Union (Combination of two sets)
        //set1.addAll(set2);
       // System.out.println("Union " + set1);   //[a, b, c, d]


        //Intersection (items that will give us the items that are common on both sets)
        //set1.retainAll(set2);//keep all the item in set2 and remove everything else from set1
        //System.out.println("Intersection " + set1);

        //Difference
        set1.removeAll(set2);
        System.out.println("Difference " + set1);



    }
}
