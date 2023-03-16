import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        customqueue queue = new customqueue(10);
        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);

        queue.display();
        System.out.println(queue.remove());
        queue.display();


    }
}
