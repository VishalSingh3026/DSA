package Vishal;

import java.util.NoSuchElementException;

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

    public int deleteFirst(){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        int temp=head.val;
        head=head.next;
        head.prev=null;
        if(head==null){
            tail=null;
        }
        size--;
        return temp;
    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        DLL.Node secondLast=get(size-2);
        int val=secondLast.next.val;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index==0){

            return deleteFirst();
        }
        if(index==size){
            return deleteLast();

        }
        Node temp=get(index-1);
        int val=temp.next.val;
        temp.next=temp.next.next;
        temp.next.prev=temp;
        return val;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return ;
        }
        if(index==size){
            insertLast(val);
            return ;
        }
        Node temp=get(index-1);
        Node node=new Node(val);
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
        size++;

    }
    public Node get(int index){
        DLL.Node node =head;
        for(int i=0;i<index;i++){
            node =node.next;
        }
        return node;
    }

    public void reverse(){
        Node node = get(size-1);
        if(size==0){
            return;
        }

        while(node!=null){
            System.out.print(node.val+" -> ");
            node=node.prev;
        }
        System.out.print("End");

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
