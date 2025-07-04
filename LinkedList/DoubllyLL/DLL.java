public class DLL {

    private Node head;
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        node.prev=null;

        if(head!=null){
            head.prev=node;
        }

        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }
    public void displayRev(){
        Node temp=tail;

        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.prev;

        }
        System.out.println("Start");
    }

    public void insertLast(int val){
        Node node=new Node(val);


        if(tail==null){
            insertFirst(val);
            return;
        }
        node.next=null;
        tail.next=node;
        node.prev=tail;
        tail=node;
        size++;


    }

    private Node tail;

    private int size;
    public DLL() {
        this.size=0;
    }
    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
