public class Main {
    public static void main(String[] args) {

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(67);
        System.out.println(cdll.head.value);

        cdll.createCDLL(1);
        cdll.insertNode(2, 0);
        cdll.insertNode(3, 2);
        cdll.insertNode(4, 5);

        System.out.println(cdll.head.value);
//        cdll.traverseCDLL();
//        cdll.deleteCDLL();
//        cdll.traverseCDLL();

    }
}
