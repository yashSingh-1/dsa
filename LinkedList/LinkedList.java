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

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return; 
        }
        Node box = new Node(val);
        tail.next = box;
        tail = box;

        size += 1;
    }

    public void insertAtPosition(int val, int position){
        if(position == 0){
            insertFirst(val);
            return;
        }
        if(position == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void deleteFirst(){

        if(size == 0){
            System.out.println("Nothing to delete!");
        }

        Node temp = head;
        int val = temp.value;
        temp = temp.next;
        head = temp;

        size -= 1;
        System.out.println("Deleted value: " + val + " size now: " + size);
    }

    public void deleteLast(){
        if(size == 0){
            System.out.println("Nothing to delete!");
        }

        if(size == 1){
            deleteFirst();
            return;
        }

        Node temp = head;
        
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
        System.out.println("Last element now: " + temp.value);

    }

    public Node getElement(int poistion){
        if(poistion == 0){
            return head;
        }

        if (poistion == size - 1) {
            return tail;
        }

        Node temp = head;
        for(int i = 0; i < poistion; i++){
            temp = temp.next;
        }

        return temp;
    }

    public void deleteElementAtPos(int pos){
        if(pos == 0){
            deleteFirst();
        }

        if(pos == size - 1){
            deleteLast();
        }

        Node prev = getElement(pos - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;


        System.out.println("Value deleted: " + val);

    }

    public void displayLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node find(int value){
        Node temp = head;
        for (int i = 0; i < size - 1; i++) {
            if(value == temp.value){
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Node not found!");
        return null ;
    }

    public void InsertRec(int val, int index){
        insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index--, node.next);
        return node;
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
