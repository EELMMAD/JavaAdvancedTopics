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

        /*
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a", "e3"));
        customers.add(new Customer("b", "e2"));
        customers.add(new Customer("c", "e1"));
       // Collections.sort(customers); //[a, b, c]
        Collections.sort(customers, new EmailComparator());  //[c, b, a]
        System.out.println(customers);

         */

        //QueueDemo.show();

        //SetDemo.show();

        MapDemo.show();
    }
}
