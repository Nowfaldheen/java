public class CQMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(10);
        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(150);
        queue.display();
    }
}
