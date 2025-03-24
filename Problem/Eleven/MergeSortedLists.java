package Problem.Eleven;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    // Method to print the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to convert array to linked list
    public static ListNode arrayToList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first list
        System.out.print("Enter the number of elements in the first list: ");
        int n1 = sc.nextInt();
        int[] list1Array = new int[n1];
        System.out.println("Enter the elements for the first sorted list: ");
        for (int i = 0; i < n1; i++) {
            list1Array[i] = sc.nextInt();
        }

        // Input for the second list
        System.out.print("Enter the number of elements in the second list: ");
        int n2 = sc.nextInt();
        int[] list2Array = new int[n2];
        System.out.println("Enter the elements for the second sorted list: ");
        for (int i = 0; i < n2; i++) {
            list2Array[i] = sc.nextInt();
        }

        // Convert arrays to linked lists
        ListNode list1 = arrayToList(list1Array);
        ListNode list2 = arrayToList(list2Array);

        // Merge the lists
        ListNode mergedList = mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.println("Merged sorted list: ");
        printList(mergedList);

        sc.close();
    }
}
