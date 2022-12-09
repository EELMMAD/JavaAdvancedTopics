package se.mosh.elmira.collections;

import se.mosh.elmira.generics.GenericList;

public class Main {
    public static void main(String[] args) {
       var list = new GenericList<>();
       list.add("a");
       list.add("b");
      for(var item : list)
          System.out.println(item);
    }
}
