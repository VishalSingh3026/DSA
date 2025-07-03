public class LL {


    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    public void inserFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size+=1;

    }

    public void insertLast(int val){
        if(tail==null){
            inserFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public void insert(int value, int index){
        if(index==0){
            inserFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
