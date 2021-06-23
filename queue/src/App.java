import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
 
 
 
 
public class App {
 
    public static void main(String[] args) {
       
         
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
         
         
        q1.add(10);
        q1.add(20);
        q1.add(30);
         
        System.out.println("Head of queue is: " + q1.element());
         
        try {
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("queue is full.");
        }
         
        for(Integer value: q1) {
            System.out.println("Queue value: " + value);
        }
         
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
         
        try {
            System.out.println("Removed from queue: " + q1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("queue is empty");
        }
         
        
         
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
         
        System.out.println("Queue 2 peek: " + q2.peek());
         
        q2.offer(10);
        q2.offer(20);
         
        System.out.println("Queue 2 peek: " + q2.peek());
         
        if(q2.offer(30) == false) {
            System.out.println("Offer failed to add third item.");
        }
         
        for(Integer value: q2) {
            System.out.println("Queue 2 value: " + value);
        }
         
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
    }
 
}