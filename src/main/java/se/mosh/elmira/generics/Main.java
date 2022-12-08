package se.mosh.elmira.generics;

public class Main {
    public static void main(String[] args) {
        /*
       var list = new GenericList<User>();
       list.add(new User());             //we do NOT need an explicit cast
      User user =  list.get(0);
         */


        //         Reference type
        // int -> Integer
        //float -> Float
        //boolean -> Boolean
        /*
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); //Boxing
        int number = numbers.get(0); //Unboxing

         */

       /*
       var user1 = new User(10);
       var user2 = new User(20);
       if(user1.compareTo(user2) < 0)
           System.out.println("user1 < user2");
       else if(user1.compareTo(user2) == 0)
           System.out.println("user1 == user2");
       else
           System.out.println("user1 > user2");

        */


        /*
        var max = Utils.max(1, 3);
        System.out.println(max);


        var max2 = Utils.max(new User(10), new User(20));
        System.out.println(max2);

         */

        /*
        Utils.print(1, 10);
         */

        /*
        User user = new Instructor(10);
        Utils.printUser(new Instructor(10));

         */

        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUser(new GenericList<User>());
    }
}
