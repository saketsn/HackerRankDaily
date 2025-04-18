package Problem.ReverseLInkedList;

/*

Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 */

import Problem.Eleven.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;
        while(current != null){
            current.next = previous;
            previous = current;
            current = next;
            if(next != null){
                next = current.next;
            }
        }
        return previous;
    }


}