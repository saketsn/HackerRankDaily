public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;


    // create cdll
    DoublyNode createCDLL(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    //Insert method
    void insertNode(int nodeValue, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;

        if(head == null){
            createCDLL(nodeValue);
            return;
        }else if( location == 0){
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }else if( location >= size){
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }else {
            DoublyNode tempNode = head;
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
            size++;
        }
    }

}
