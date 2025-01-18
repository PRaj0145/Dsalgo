package dsaalgo;

public class Main {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(78);
        list.insertFirst(9);
        list.insertFirst(10);

        list.insertLast(100);

        list.display();

    }
}
