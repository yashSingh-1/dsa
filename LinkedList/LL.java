package LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(98);
        ll.insertFirst(28);
        ll.insertAtPosition(765, 2);
        ll.displayLL();
        ll.InsertRec(33, 2);
        ll.displayLL();
        // ll.deleteFirst();
        // ll.deleteLast();
        // ll.deleteElementAtPos(2);
        System.out.println(ll.find(765));
        // ll.displayLL();

        // DoublyLinkedList ll2 = new DoublyLinkedList();
        // ll2.addFirst(987);
        // ll2.addFirst(487);
        // // ll2.addLast(69);
        // ll2.addLastUsingTail(69);
        // ll2.addLastUsingTail(112);
        // ll2.addLastUsingTail(278);
        // ll2.addLastWithoutUsingTail(420);
        // ll2.addLastWithoutUsingTail(420);
        // ll2.display();
        // ll2.insertAtPositionGiven(133, 1);
        // // System.out.println(ll2.get(1));
        // ll2.display();
        // // ll2.revereDisplay();

        // CircularLinkedList cll = new CircularLinkedList();
        // cll.insert(21);
        // cll.insert(45);
        // cll.insert(1212);
        // cll.insert(54);
        // cll.display();
        // cll.deleteAtPos(3);
        // cll.display();
    }
}
