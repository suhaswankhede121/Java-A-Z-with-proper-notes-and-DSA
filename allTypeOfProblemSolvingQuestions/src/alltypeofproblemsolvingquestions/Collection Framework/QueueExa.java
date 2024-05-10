import java.util.*;

public class QueueExa {
    public static void main(String[] args) {
        //Queue<Integer> q=new LinkedList<>();

       // Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());

       Queue<Integer> q=new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(11);
        q.offer(0);
        q.offer(100);

        System.out.println(q);

        // System.out.println(q.poll());

        // System.out.println(q.peek());

        // q.add(4);
        // System.out.println(q.element());

        // q.remove();
        // System.out.println(q);
    }
}
