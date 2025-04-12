package SingleLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createSinglyLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);
        head = node;
        tail = node;
        size = 1;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node(nodeValue);

        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("The singly linked list does not exist.");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.value);
                if (tempNode.next != null) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i = 0; i< size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Found the node at location : " + i+ "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found.");
        return false;
    }

    public void deleteByPosition(int position){
        if(head == null){
            System.out.println("list is empty");
        }

         if (position == 0){
            head = head.next;
            return ;
         }
         Node current = head;
         for(int i = 0; current != null && i <  position -1; i++){
             current = current.next;
         }
         if(current == null || current.next == null){
             System.out.println("Invalid positon.");
             return;
         }

         current.next = current.next.next;

    }

    public void deleteByValue(int value){
        if(head == null){
            System.out.println("List is empty.");
        }

        if(head.value == value ){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null && current.next.value != value){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("Value not found");
            return;
        }
        current.next = current.next.next;
    }

}
