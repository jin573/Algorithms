import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            //하나 꺼냄
            int[] e = q.poll();
            int x = e[0];
            int y = e[1];
            
            //만약 끝이라면 종료
            if(x == maps.length-1 && y == maps[0].length-1){
                return maps[x][y];
            }
            //방문할 수 있는 곳 탐색
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                //범위 밖이면 continue;
                if(nx < 0 || ny < 0 ||
                   nx >= maps.length ||
                   ny >= maps[0].length)
                    continue;
                
                //막혀있거나 방문한 곳이면 continue;
                if(maps[nx][ny] == 0 || visited[nx][ny] == true)
                    continue;
                
                //방문
                visited[nx][ny] = true;
                //최솟값
                maps[nx][ny] = maps[x][y] + 1; //기존 값에 +1
                //큐에 추가
                q.add(new int[]{nx, ny});
            }
        }
        
        return -1;
    }
}