package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node box = new Node(val);
        box.next = head;
        head = box;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void displayLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
