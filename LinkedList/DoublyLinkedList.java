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

    // public void addLast(int val){
    //     if(tail == null){
    //         addFirst(val);
    //         return; 
    //     }
    //     System.out.println("Size: " + size);
    //     Nodes prev = get(size-1);
    //     System.out.println("Here is the prev val : " + prev.val);
    //     Nodes node = new Nodes(val);
    //     node.next = null;
    //     node.prev = prev;
    //     tail = node;
         

    //     size++;
    // }

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
}
