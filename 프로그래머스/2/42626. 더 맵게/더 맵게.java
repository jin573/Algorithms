import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        //스코빌 지수 계산이 반복된다.
        //배열 정렬? 우선큐?
        //백트래킹? 아님
        //배열 시 정렬 크기 너무 큼 우선 큐
        
        //스코빌 지수가 가장 낮은 원소 두 개 꺼냄
        //K랑 비교
        //연산
        //카운트
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        
        for(int i = 0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        while(!pq.isEmpty()){
            
            if(pq.size() == 1){
                int cnt = pq.poll();
                if(cnt < K){ return -1;}
                else return count;
            }
            
            int idx1 = pq.poll();
            int idx2 = pq.poll();
            
            if(idx1 < K || idx2 < K){
                int num = idx1 + (idx2 * 2);
                pq.add(num);
                count++;
            }else{
                continue;
            }
        }
        
        return count;
    }
}