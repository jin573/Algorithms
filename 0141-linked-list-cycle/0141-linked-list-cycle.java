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

import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        //위치를 저장할 수 있다면? 
        //<위치, 탐색 횟수>
        //굳이 탐색 횟수가 저장되지 않아도 됨. 한번이라도 저장되면 됨. 

        Set<ListNode> set = new HashSet<>();

        //한번이라도 저장된 경우 return true;
        //null을 만나는 경우 return false;
        
        while(head != null){
            
            //set에 head의 주소가 있다면
            if(set.contains(head)){
                //head를 set에 저장
                return true;
            }else{
                //주소가 있다면
                set.add(head);
            }

            //head를 다음 head로 옮기기
            head = head.next;
        }

        return false;


    }
}