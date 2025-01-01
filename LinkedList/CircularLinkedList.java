package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    int size = 0;

    private class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;

        if(temp != null){
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while(temp != head);
        }
        System.out.println("HEAD");
    }

    public Node get(int pos){
        if(pos == 0){
            return head;
        }

        Node temp = head;
        for(int i = 0; i <= pos; i++){
            temp = temp.next;
        }

        return temp;
    }

    public void deleteAtPos(int pos){
        Node prev = get(pos - 1);
        prev.next = prev.next.next;
    }
}
