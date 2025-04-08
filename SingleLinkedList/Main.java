package SingleLinkedList;

class Node
{

    public int value;
    public Node next;
}


class SinglyLinkedList{

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglylinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;

        return head;
    }
}

class Main{
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglylinkedList(5);
        System.out.println(sll.head.value);
    }
}
