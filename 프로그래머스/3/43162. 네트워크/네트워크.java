class Solution {
    public int solution(int n, int[][] computers) {
        //영역 -> 백트래킹 필요 없음
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0; i<computers.length; i++){
            if(!visited[i]){
                dfs(i, visited, computers);
                count++;
            }
        }
        
        return count;
    }
    
    public void dfs(int idx, boolean[] visited, int[][] computers){
        visited[idx] = true;
        
        for(int i = 0; i<computers[idx].length; i++){
            if(!visited[i] && computers[idx][i] == 1){
                dfs(i, visited, computers);
            }
        }
        
    }
}