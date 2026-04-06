import java.util.*;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        //영역 -> 백트래킹x
        //가장 큰 영역 -> int
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        int size = 0;
        int max = 0;
        
        for(int i = 0; i<picture.length; i++){
            for(int j = 0; j<picture[0].length; j++){
                if(!visited[i][j] && picture[i][j] != 0){
                    size = dfs(i, j, picture, visited);
                    
                    count++;
                    max = Math.max(max, size);
                }
            }
        }
        
        return new int[]{count, max};
    }
    
    public int dfs(int x, int y, int[][] picture, boolean[][] visited){
        
        visited[x][y] = true;
        
        int size = 1; 
        //상하좌우에서 맞는 영역 가기
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
        
            if(nx < 0 || nx >= picture.length || 
              ny < 0 || ny >= picture[0].length){
                
                continue;
            }
            
            if(!visited[nx][ny] && picture[nx][ny] == picture[x][y]){
            
                size += dfs(nx, ny, picture, visited);
            }
        }
        
        return size;
    }
}