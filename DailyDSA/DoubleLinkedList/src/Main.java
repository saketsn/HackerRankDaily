public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(11);
        dll.insertDLL(22,0);
        dll.insertDLL(43,1);
        dll.insertDLL(67,9);
        System.out.println(dll.head.value);
        dll.traverseDLL();

    }
}
