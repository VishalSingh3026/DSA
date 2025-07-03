package Vishal;

public class Main {

    public static void main(String[] args) {
        LL list =new LL();
        list.inserFirst(3);
        list.inserFirst(2);
        list.inserFirst(1);
        list.inserFirst(16);
        list.insert(5,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.inserFirst(19);
        list.inserFirst(20);
        list.display();
        System.out.println(list.delete(1));
        list.display();

    }
}
