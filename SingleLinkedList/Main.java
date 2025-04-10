package SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertInLinkedList(10, 0); // Insert at head
        sll.insertInLinkedList(20, 1); // Insert at tail
        sll.insertInLinkedList(30, 2); // Insert at tail again
        sll.insertInLinkedList(5, 0);  // Insert at new head
        sll.insertInLinkedList(15, 2); // Insert at middle

        System.out.println("Singly Linked List:");
        sll.traverseSinglyLinkedList();
        sll.searchNode(100);
        sll.searchNode(10);
    }
}
