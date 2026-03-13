class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int cnt = 0;
        for(int i = 0; i<n; i++){
            if(!visited[i]){
                dfs(i, visited, computers);
                cnt++;
            }
        }
        
        return cnt;
    }
    
    private void dfs(int index, boolean[] visited, int[][] computers){
        visited[index] = true;
        
        for(int i = 0; i<computers[index].length; i++){
            if(index != i && computers[index][i] == 1 && !visited[i]){
                dfs(i, visited, computers);
            }
        }
    }
}