package se.mosh.elmira.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
       var list = new GenericList<>();
       list.add("a");
       list.add("b");
      for(var item : list)
          System.out.println(item);
         */


       // CollectionsDemo.show();

       // ListDemo.show();

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a"));
        customers.add(new Customer("b"));
        customers.add(new Customer("c"));
        Collections.sort(customers);
        System.out.println(customers);
}
}
