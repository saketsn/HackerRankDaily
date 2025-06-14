public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;


    public DoublyNode createDLL(int nodeValue){
        //head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    //Insertion Method
    public void insertDLL(int nodeValue, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null){
            createDLL(nodeValue);
            return ;
        } else if(location == 0){
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size){
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;

    }

    public void traverseDLL(){
       if(head != null){
           DoublyNode tempNode = head;
           for (int i = 0; i< size; i++){
               System.out.print(tempNode.value);
               if(i != size -1){
                   System.out.print(" -> ");
               }
               tempNode = tempNode.next;
           }
       }else{
           System.out.println("LinkedList does not exists");
       }
        System.out.println("\n");
    }

    public void RevTraverseDLL(){
        if(head != null){
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        }else{
            System.out.println("LinkedList does not exists");
        }
        System.out.println("\n");
    }

    public boolean  search(int value){
        if(head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == value) {
                    System.out.println("Value found at index = " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
            System.out.println("Given value in LinkedList does not exists");
            return false;



    }


}
