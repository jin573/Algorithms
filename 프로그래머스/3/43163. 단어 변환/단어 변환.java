import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        q.add(new int[]{-1, 0});
        
        while(!q.isEmpty()){

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
            
            //반복문을 돌면서 변환 가능한지 탐색
            for(int i = 0; i<words.length; i++){
                if(!visited[i]){
                    //한 단어만 다른지 확인
                    char[] s_arr = str.toCharArray();
                    char[] w_arr = words[i].toCharArray();
                    int check = 0;
                    for(int j = 0; j<s_arr.length; j++){
                        if(s_arr[j] != w_arr[j]){
                            check++;
                        }
                    }

                    //한 단어만 다른 경우
                    if(check == 1){
                        visited[i] = true;
                        q.add(new int[]{i, cnt + 1});
                    }
                }
                
            }
        }
        
        return 0;
    }
    
}