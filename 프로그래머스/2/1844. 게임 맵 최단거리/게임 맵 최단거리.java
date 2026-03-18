import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        //bfs로 풀기
        //큐에 넣고 막혀있으면 방문X
        
        Queue<int[]> q = new LinkedList<>();
        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, 1, -1};
        
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        
        int cnt = 0;
        
        //시작점 넣기
        q.add(new int[]{0, 0});
        visited[0][0] = true;

        //인접 노드 방문 
        while(!q.isEmpty()){

            int[] arr = q.poll();
            
            if(arr[0] == maps.length -1 && arr[1] == maps[0].length -1) 
                return maps[arr[0]][arr[1]];
            
            for(int j = 0; j<x.length; j++){
                int dx = arr[0] + x[j];
                int dy = arr[1] + y[j];

                if(dx < 0 || dy < 0 || dx >= maps.length || dy >= maps[0].length){
                    continue;
                }
                
                if(visited[dx][dy] == true) continue;

                if((maps[dx][dy] == 1) && (visited[dx][dy] == false)){
                    //방문
                    visited[dx][dy] = true;
                    //큐에 넣기
                    maps[dx][dy] = maps[arr[0]][arr[1]] + 1;
                    q.add(new int[]{dx, dy});
                }
            }
            
        }
        
        return -1;
    }
}