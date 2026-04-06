import java.util.*;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        boolean[][] visited = new boolean[m][n];
        int count=0;
        int max = 0;
        int sum = 0;
        //각 배열을 돌면서
        //상하좌우 영역의 숫자가 같은 경우 count
        for(int i = 0; i<picture.length; i++){
            for(int j = 0; j<picture[i].length; j++){
                if(!visited[i][j] && picture[i][j] != 0){
                    sum = dfs(i, j, visited, picture);
                    count++;
                    max = Math.max(max, sum);
                }
            }
        }
        
        return new int[]{count, max};
    }
    
    public int dfs(int x, int y, boolean[][] visited, int[][] picture){
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int sum = 1;
        visited[x][y] = true;
        
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx < 0 || nx >= picture.length 
                   || ny <0 || ny >= picture[i].length){
                    continue;
            }
            
            if(!visited[nx][ny]){
                if(picture[nx][ny] == picture[x][y]){
                    sum += dfs(nx, ny, visited, picture);
                }
            }
        }
        
        return sum;
    }
}