import java.util.*;

class Solution {
    public int[] solution(String[][] places) {
       
        char[][] arr = new char[5][5];
        int[] ans = new int[5];
        for(int i = 0; i<places.length; i++){
            boolean finished = false;
            for(int j = 0; j<places[i].length; j++){    
                for(int k = 0; k<5; k++){
                    arr[j][k] = places[i][j].charAt(k);
                }
            }
            
            for(int j = 0; j<places[i].length; j++){    
                for(int k = 0; k<5; k++){
                    if(arr[j][k] == 'P'){
                        if(bfs(j, k, arr)==0){
                            finished = true;
                            break;
                        }
                    }
                }
                if(finished) break;
            }
            
            ans[i] = finished ? 0 : 1;
        }
        
        return ans;
    }
    
    public int bfs(int x, int y, char[][] arr){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[5][5];
        
        q.offer(new int[]{x, y, 0});
        visited[x][y] = true;
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            int dist = cur[2];
            
            for(int i = 0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx < 0 || nx >= arr.length ||
                  ny < 0 || ny >= arr[0].length)
                    continue;
                
                if(visited[nx][ny]){
                    continue;
                }
                
                if(arr[nx][ny] == 'X') continue;
                if(arr[nx][ny] == 'P' && dist + 1 <= 2) return 0;
                visited[nx][ny] = true;
                if(dist + 1 <= 2){
                    
                    q.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }
        
        return 1;
        
    }
}