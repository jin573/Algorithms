import java.util.*;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        //bfs
        //내 위치 -> 상하좌우 탐색 -> 그 위치가 rectangle의 경로인 경우 & !visited
            // -> q에 add
        // 조건: rectangle 계산
        // 종료: 아이템 위치에 도달했을 때의 cnt
        boolean[][] visited = new boolean[101][101];
        int[][] places = new int[101][101];
        
        for(int i = 0; i<rectangle.length; i++){
            //rectangle[i][0] ~ rectangle[i][2]
            for(int x = rectangle[i][0] * 2; x <= rectangle[i][2] * 2; x++){
                for(int y = rectangle[i][1] * 2; y <= rectangle[i][3] * 2; y++){
                    places[x][y] = 1;
                }
            }
        }
        
        
        for(int i = 0; i<rectangle.length; i++){
            //rectangle[i][0] ~ rectangle[i][2]
            for(int x = rectangle[i][0] * 2 + 1; x < rectangle[i][2] * 2; x++){
                for(int y = rectangle[i][1] * 2 + 1; y < rectangle[i][3] * 2; y++){
                    places[x][y] = 0;
                }
            }
        }
        
        characterX *= 2;
        characterY *= 2;
        itemX *= 2;
        itemY *= 2;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{characterX, characterY, 0});
        visited[characterX][characterY] = true;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            //현재 값
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];
    
            if(x == itemX && y == itemY){
                return cnt / 2;
            }
            
            //상하좌우 값 구하기
            int[] dx = {1, -1, 0, 0};
            int[] dy = {0, 0, 1, -1};
            
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || nx >= 101
                  || ny < 0 || ny >= 101){
                    continue;
                }
                
                //방문한 적 없고 외곽에 해당
                if(!visited[nx][ny] && places[nx][ny] == 1){
                    
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, cnt+1});
                }
                
            }
            
            
        }
        
        return 0;
    }
}