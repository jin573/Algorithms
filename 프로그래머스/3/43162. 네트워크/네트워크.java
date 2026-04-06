class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0; i<computers.length; i++){
            if(!visited[i]){
                dfs(computers, i, visited);
                count++;
            }
        }
        
        return count;
    }
    
    public void dfs(int[][] computers, int idx, boolean[] visited){
        visited[idx] = true;
            
        for(int i = 0; i<computers[idx].length; i++){
            if(!visited[i] && computers[idx][i] == 1){
                dfs(computers, i, visited);
            }
        }
    }
}