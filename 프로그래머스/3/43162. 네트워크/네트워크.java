class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        
        //첫번째부터 방문(첫번째...마지막)//visited 되어있으면 pass
            //본인이 아니고, 연결되어있으면 visited(첫번째...마지막 원소)
            //더이상 연결된게 없으면 return
            //횟수 카운트
        int count = 0;
        for(int i = 0; i<n; i++){
            if(!visited[i]){
                dfs(visited, computers, i);
                count++;
            }
        }
        
        return count;
    }
    
    private void dfs(boolean[] visited, int[][] computers, int i){
        //방문함으로 변경하기 
        if(visited[i] == true) return;
        
        //본인이 속한 배열 가져오기
        //그 안에서 본인 제외 확인하기 
        
        visited[i] = true; //본인은 true
        for(int j = 0; j<computers[i].length; j++){
            if(j != i && computers[i][j] == 1 && visited[j] == false){
                dfs(visited, computers, j);
            }
        }
        
    }
}