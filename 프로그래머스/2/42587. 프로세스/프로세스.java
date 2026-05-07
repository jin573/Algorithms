import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        //[프로세스 번호, 우선순위]
        //대기 큐에 넣기
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i<priorities.length; i++){
            q.add(new int[]{i, priorities[i]});
        }
        
        //꺼내기
        //남은 큐의 우선순위보다 모두 크면 실행
        //아니면 다시 넣기
        
        int count = 0;
        
        while(!q.isEmpty()){
            
            int[] arr = q.poll();
            int process = arr[0];
            int priority = arr[1];
            boolean isBig = false;
            
            
            
            for(int[] arr2 : q){
                int idx1 = arr2[0];
                int idx2 = arr2[1];
                
                if(priority < idx2){
                    isBig = true;
                }
            }
            
            if(isBig){
                q.add(new int[]{process, priority});
            }else{
                if(process == location){
                    return count+1;
                }else{
                    count++;
                }
            }
        }
        return count;
    }
}