package se.mosh.elmira.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();

        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d");
        // d -> b -> a -> c   front of queue

        //get the item from front of queued
       // var front = queue.peek();
        //System.out.println(front);  //c

        //remove the item from the front of the queue
        System.out.println(queue.remove());
        System.out.println(queue);

        /*
        var element = queue.peek();
        System.out.println(element);   //NoSuchElementException

         */
    }
}
