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
        node.prev = null;
        
        if(head != null){
            head.prev = node;
        }
        
        if(tail == null){
            tail = head;
        }
        
        head = node;

        size++;
    }

    public void display(){
        Nodes temp = head;
        // while(temp.next != null){
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Nodes get(int position){
        Nodes temp = head;
        for(int i = 0; i <= position; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void addLastUsingTail(int val){
        Nodes temp = tail;
        Nodes node = new Nodes(val);
        temp.next = node;
        node.prev = temp;
        tail = node;
        node.next = null;
    }

    public void addLastWithoutUsingTail(int val){
        Nodes temp = head;
        Nodes last = head;

        while(temp.next != null){
            temp = temp.next;
            if(temp.next == null){
                last = temp;
            }
        }

        System.out.println("Last element : " + last.val);
        Nodes lastElement = new Nodes(val);
        last.next = lastElement;
        lastElement.next = null;
        lastElement.prev = temp;
        tail = lastElement;
    }

    public void revereDisplay(){
        Nodes temp = tail;

        while(temp != null){
            System.out.print( " <- " + temp.val );
            temp = temp.prev;
        }
        System.out.println();
    }

    public void insertAtPositionGiven(int val, int pos){
        if(pos == 0){
            addFirst(val);
            return;
        }

        if(pos == size - 1){
            addLastUsingTail(val);
            return;
        }

        // Nodes currentAtPos = get(pos);
        Nodes temp = head;
        for(int i = 0; i < pos; i++){
            temp = temp.next;
            System.out.println("value : " + temp.val);
        }
        
        Nodes newNode = new Nodes(val);
        temp.prev = newNode;
        newNode.next = temp.next.next;
        newNode.prev = temp.prev.prev;
        
        // if(temp.next != null){
        //     temp.next = temp.next.next;
        // }
    }
}
