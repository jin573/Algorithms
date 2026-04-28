import java.util.*;
class Solution {
    int count = 0;
    public int solution(int[] scoville, int K) {
        //어떤 자료구조를 사용하는게 좋을까? 
        //1. arraylist
        //2. queue?
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
        for(int i = 0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        //조건에 맞는지 확인
            //조건에 안맞으면 다시 계산
            //조건에 맞으면 횟수 return 
       
        while(pq.peek() < K){
            
            if(pq.size() < 2) return -1;
            
            int a = pq.poll();
            int b = pq.poll();
            
            pq.add(a + (b*2));
            count++;
            
        }
       
        return count;
    }

}