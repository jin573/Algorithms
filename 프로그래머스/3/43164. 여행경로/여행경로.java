import java.util.*;

class Solution {
    boolean finished = false;
    public String[] solution(String[][] tickets) {
        //i번 방문
            //dfs
                //언제 끝? 그 다음에 해당하는 a가 없을때
                //돌아와서 다음 원소로 가야함 -> 따라서 정렬 필요
        
        boolean visited[] = new boolean[tickets.length];
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        String[] arr = new String[tickets.length+1];
        
        arr[0] = "ICN";
        for(int i = 0; i<tickets.length; i++){
            if(tickets[i][0].equals("ICN")){
                visited[i] = true;
                dfs(visited, tickets, i, 1, arr, 1);
                visited[i] = false;
            }
        }
        return arr;
    }
    
    public void dfs(boolean[] visited, String[][] tickets, int idx,
                   int j, String[] arr, int depth){
        if(finished){
            return;
        }
        
        arr[j] = tickets[idx][1];
        if(depth == tickets.length) {
            finished = true;
            return;
        }
        
        
        for(int i = 0; i<tickets.length; i++){
            //반복문을 돌면서
                //이번 값이 ticket[i][0] 와 같고 && 본인 차례가 아닌 경우
                    //visited 하기
            if(!visited[i] && tickets[idx][1].equals(tickets[i][0])){
                visited[i] = true;
                dfs(visited, tickets, i, j+1, arr, depth+1);
                visited[i] = false;
            }
        }
    }
        
}