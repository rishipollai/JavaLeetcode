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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode();
        ListNode head = cur;
        ListNode a1=l1;
        ListNode a2=l2;
        
        while(a1!=null && a2!=null){
            ListNode listNode;
            
            if(a1.val<=a2.val){
                listNode = new ListNode(a1.val);
                cur.next=listNode;
                cur=cur.next;
                a1=a1.next;
            }
            else{
                listNode = new ListNode(a2.val);
                cur.next=listNode;
                cur=cur.next;
                a2=a2.next;
            }
        }
        if(a1!=null)
            cur.next=a1;
        if(a2!=null)
            cur.next=a2;
            
        
        return head.next;
    }
}
