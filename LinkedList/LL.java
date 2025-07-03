package Vishal;


import java.util.NoSuchElementException;

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

     public Node find(int val){

        Node node =head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node =node.next;
        }
        return null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public int deleteFirst(){

        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node secondLast=get(size-1);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index);

        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    public Node get(int index){
        Node node =head;
        for(int i=1;i<index;i++){
            node =node.next;
        }
        return node;
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
