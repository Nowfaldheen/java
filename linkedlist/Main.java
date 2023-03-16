package linkedlist;

public class Main {
    public static void main(String[] args) {
        list l= new list();
        l.insertFirst(110);
        l.insertFirst(1);
        l.insertFirst(10);
        l.insertFirst(11);
        l.insertFirst(15);
        l.insertFirst(6110);
        l.insert(300,3);
        l.display();
        System.out.println(l.deleteFirst());
        l.display();
        System.out.println(l.deletelast());
        l.display();
    }

}
