class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        //나올 수 있는 경우의 수
        //012 021 102 120 201 210
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, 0, visited, dungeons);
        return answer;
    }
    
    public void dfs(int k, int cnt, boolean[] visited, int[][] dungeons){
        
        answer = Math.max(answer, cnt);
        
        for(int i = 0; i<dungeons.length; i++){
            if(!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                dfs(k - dungeons[i][1], cnt+1, visited, dungeons);
                visited[i] = false;
            }
            
        }
    }
}