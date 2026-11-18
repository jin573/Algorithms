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
 import java.util.*;

class Solution {
    public ListNode reverseList(ListNode head) {

        //listnode는 값과 next를 갖고 있음
        //next가 없을 때 까지 계속 탐색
        //끝나면 그때부터 val을 반환
        ListNode result = null;

        if(head == null){
            return null;
        }

        if(head.next == null){
           return head;
        }else{
            result = reverseList(head.next);
            head.next.next = head;
            head.next = null;
        }

        return result;
    }
}