import java.util.*;
class Solution {
    int max = 0;
    public int solution(int k, int[][] dungeons) {
        int count = 0;
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, count, visited, dungeons);
        return max;
    }
    
    public void dfs(int k, int count, boolean[] visited, int[][] dungeons){
        max = Math.max(max, count);
        
        for(int i = 0; i<dungeons.length; i++){
            if(!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                dfs(k - dungeons[i][1], count+1, visited, dungeons);
                visited[i] = false;
            }
        }
    }
}