package SingleLinkedList;

public class Main {
    static Node head;
    static Node tail;
    static int size;

    public static void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
            createSinglylinkedList(nodeValue);
            return;
        } else if(location == 0){
            node.next = head;
            head = node;
        } else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public static void createSinglylinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    static class Node {
        int value;
        Node next;
    }

    public static void main(String[] args) {
        insertInLinkedList(10, 0);
        insertInLinkedList(20, 1);
        insertInLinkedList(30, 2);
        // print list
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }
}
