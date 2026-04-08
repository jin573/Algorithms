import java.util.*;

class Solution {
    int max = 0;
    public int solution(int k, int[][] dungeons) {
        //현재 상태, 던전으로 들어가서 계산 -> dfs 
            // 그 후 피로도 max 구하기 
        boolean[] visited = new boolean[dungeons.length];
        
        //문제는 순서
        for(int i = 0; i<dungeons.length; i++){
            if(!visited[i]){
                //최소 피로를 만족하면 k -= 소모피로도로 들어가기 
                if(k >= dungeons[i][0]){
                    visited[i] = true;
                    dfs(k - dungeons[i][1], dungeons, visited, 1);
                    visited[i] = false;
                }
               
            }
        }
        
        return max;
    }
    
    public void dfs(int k, int[][] dungeons, boolean[] visited, int cnt){
        //언제 종료하나?
        //최소 피로를 만족하지 않을 때
        //반복문 안에서만 판별?
        boolean isGo = false;
        
        for(int i = 0; i<dungeons.length; i++){
            if(!visited[i]){
                if(k >= dungeons[i][0]){
                    isGo = true;
                    visited[i] = true;
                    dfs(k - dungeons[i][1], dungeons, visited, cnt + 1);
                    visited[i] = false;
                }
            }
        }
        
        if(!isGo){
            max = Math.max(max, cnt);
        }
    }
}