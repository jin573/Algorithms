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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //두 리스트의 next가 null일 경우 종료
        ListNode head, tail;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        //시작점
        if(list1.val <= list2.val){
            head = list1;
            tail = list1;
            list1 = list1.next;

        }else{
            head = list2;
            tail = list2;
            list2 = list2.next;
        }  


        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                //list1의 노드를 연결
                //list1의 다음 노드로 이동
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;

            }else{
                //list2의 노드를 연결
                //list2의 다음 노드로 이동
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        if(list1 == null){
                tail.next = list2;
            }
            
        if(list2 == null){
            tail.next = list1;
        }

        return head;

        
    }
}