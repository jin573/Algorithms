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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //노드의 시작~끝까지 1번은 탐색해야 함?
        HashMap<Integer, ListNode> map = new HashMap<>();

        ListNode node = head;
        int i = 1;
        int size = 0;
        while(node != null){
            map.put(i, node);
            node = node.next;
            i++;
            size++;
        }

        ListNode prev = map.get(size - n);
        ListNode target = map.get(size - n + 1);

        if(prev == null){
            return target.next;
        }else{
            prev.next = target.next;
            return head;
        }
        

    }
}