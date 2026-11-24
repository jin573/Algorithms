/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.*;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //두 포인터와 하나의 해시를 둔다.
        //해시에 저장이 되어있는지 확인한다.
        //없으면 주소를 저장한다.
        //두 번 반복
        //있으면 해당 주소의 val을 return
        
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        HashSet<ListNode> set = new HashSet<>();

        while(nodeA != null){
            if(!set.contains(nodeA)){
                set.add(nodeA);
                nodeA = nodeA.next;
            }else{
                return nodeA;
            }
        }

        while(nodeB != null){
            if(!set.contains(nodeB)){
                set.add(nodeB);
                nodeB = nodeB.next;
            }else{
                return nodeB;
            }

        }


        return null;
    }
}