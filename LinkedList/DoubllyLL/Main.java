
public class Main {

    public static void main(String[] args) {

        DLL list =new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(16);
        list.display();
        list.displayRev();
        list.insertLast(20);
        list.display();

    }
}