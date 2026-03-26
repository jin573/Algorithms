import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        //짧은 변환 과정 -> bfs -> 큐 사용
        //begin 부터 words의 각 원소를 순차적으로 검색 (-> dfs도 되나..?->bfs가 맞는듯?)
            //그 과정에서 로직 필요 (알파벳 하나만 변경)
            //그게 여러개 면 큐에 저장? 다시 bfs..? ㅋㅋ ㅜㅠ
            
        //배열 구조 {index, count} -> 나중에 count 값만 비교해서 최소값 리턴
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{-1, 0});

        boolean[] visited = new boolean[words.length];
        
        
        while(!q.isEmpty()){
            //큐의 첫 번째 원소 꺼냄
            int[] arr = q.poll();
            int idx = arr[0]; 
            int cnt = arr[1]; 
            
            String str; 
            if(idx == -1){
                str = begin;
            }else{
                str = words[idx];
            }
            if(str.equals(target)){
                return cnt;
            }
            //words의 idx부터 마지막번째 원소와 비교 
                //하나만 달라야 함(같은 자리 비교)
            for(int i = 0; i<words.length; i++){
                char[] c_arr = str.toCharArray();
                char[] i_arr = words[i].toCharArray();
                int diff = 0;
                
                if(visited[i] == true) continue;
                //로직
                for(int j = 0; j<c_arr.length; j++){
                    if(c_arr[j] != i_arr[j]){
                        diff++;
                    }
                }    
                    //조건에 해당하는 경우 
                if(diff == 1){
                    visited[i] = true;
                    q.add(new int[]{i, cnt+1}); //hot 들어감 
                    
                }
            }
        }
        
        return 0;
    }
}