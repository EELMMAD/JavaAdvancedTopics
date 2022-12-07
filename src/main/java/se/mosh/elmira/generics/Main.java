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

       var user1 = new User(10);
       var user2 = new User(20);
       if(user1.compareTo(user2) < 0)
           System.out.println("user1 < user2");
       else if(user1.compareTo(user2) == 0)
           System.out.println("user1 == user2");
       else
           System.out.println("user1 > user2");
    }
}
