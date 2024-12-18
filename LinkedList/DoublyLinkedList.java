package LinkedList;

public class DoublyLinkedList {
    private Nodes head;
    private Nodes tail;

    private int size = 0;

    DoublyLinkedList() {
        this.size = size;
    }

    private class Nodes {
        int val;
        Nodes next;
        Nodes prev;

        Nodes(int val){
            this.val = val;
        }

        Nodes(int val, Nodes next, Nodes prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(int val){
        Nodes node = new Nodes(val);
        node.next = head;
        head = node;
        node.prev = null;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void display(){
        Nodes temp = head;
        // while(temp.next != null){
        for(int i = 0; i < size; i++){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
