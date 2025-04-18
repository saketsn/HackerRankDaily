package DailyDSA.CircularLinkedList;

public class Main{

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4,0);
        csll.insertCSLL(33,1);
        csll.insertCSLL(45,8);
        csll.insertCSLL(7,9);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);

    }
}
