package se.mosh.elmira.generics;

public class Main {
    public static void main(String[] args) {
       var list = new GenericList<User>();
       list.add(new User());             //we do NOT need an explicit cast
      User user =  list.get(0);
    }
}
