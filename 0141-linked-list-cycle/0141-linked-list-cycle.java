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
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        boolean t = true;
        
        do{
            if(fast == null || fast.next == null){
                t = false;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }while(fast!=slow);
        return t;
    }
}