package se.mosh.elmira.generics;

public class User implements Comparable<User>{
    private int points;

    public User(int points){
        this.points = points;
    }

    //this < other   ->  -1
    //this == other  ->   0
    //this > other   ->   1
    @Override
    public int compareTo(User other) {
        return points - other.points;
    }
}
