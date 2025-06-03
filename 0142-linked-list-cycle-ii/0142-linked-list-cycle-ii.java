/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode fastPtr = head;
      ListNode slowPtr = head;

      while (fastPtr != null && fastPtr.next != null) {
         fastPtr = fastPtr.next.next;
         slowPtr = slowPtr.next;

         if (fastPtr == slowPtr) {
            return getStartingNode(slowPtr,head);
         }
      }
      return null;
    }
     private ListNode getStartingNode(ListNode slowPtr,ListNode head) {
      ListNode temp = head;
      while (temp != slowPtr) {
         temp = temp.next;
         slowPtr = slowPtr.next;
      }
      return temp; // starting node of the loop
   }
}