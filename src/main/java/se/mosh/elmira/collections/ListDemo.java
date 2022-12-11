package se.mosh.elmira.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        /*
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");

         */
        Collections.addAll(list, "a", "b", "c", "a");
       // list.set(0, "a+");
       // list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("b")); //1
        System.out.println(list.indexOf("a+")); // -1
        System.out.println(list.lastIndexOf("a"));//3  LAST occurrence
        System.out.println(list.subList(0, 2));  //0 inclusive   1 Exclusive      [a, b]
    }

}
