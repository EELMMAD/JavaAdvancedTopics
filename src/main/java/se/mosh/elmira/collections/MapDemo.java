package se.mosh.elmira.collections;

import java.util.HashMap;
import java.util.Map;

//Java -> Map
//C# -> Dictionary
//Python -> Dictionary
//JavaScript -> Objects
//var person = {name: "a}

public class MapDemo {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var unknown = new Customer("Unknown", "");
        // var customer = map.get("e1"); //a
        // var customer = map.get("e10"); //null
        // var customer = map.getOrDefault("e10", unknown);
        //  var exists = map.containsKey("e10");
       // map.replace("e1", new Customer("a++", "e1"));

        /*
        for(var key : map.keySet())  //return the list of keys in map
        System.out.println(key);
         */

        /*
        for(var entry : map.entrySet()) //returns a set of entry string and customer,
                                        // it returns a set of entry of string     key=value
            //System.out.println(entry);
            //System.out.println(entry.getValue());
            System.out.println(entry.getKey());

         */

        for(var customer : map.values())
            System.out.println(customer);
    }
}
