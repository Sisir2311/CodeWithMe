/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        int size = 0;
        if (head == null || head.next == null) {
            return true;
        }
        while(curr != null){
            curr = curr.next;
            size++;
        }
        int index = 0;
        if(size % 2 == 0){
            index = size/2 + 1;
        }else{
            index = (size + 1)/2 + 1;
        }
        int i = 1;
        ListNode newid = head;
        while(i < index){
            i++;
            newid = newid.next;
        }
        
        ListNode newwid = reversell(newid);
        curr = head;
        while(newwid != null){
            if(curr.val != newwid.val){
                return false;
            }
            curr = curr.next;
            newwid = newwid.next;
        }
        return true;
    }
    public ListNode reversell(ListNode head){
            ListNode prev = head;
            ListNode curr = head.next;
            while(curr != null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head.next = null;
            head = prev;
            return head;
        }
}
