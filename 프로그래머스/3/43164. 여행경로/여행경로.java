import java.util.*;
class Solution {
    boolean isFinished = false;
    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        boolean[] visited = new boolean[tickets.length];
        String[] arr = new String[tickets.length +1];
        
        arr[0] = "ICN";
        dfs(arr, visited, tickets, "ICN", 1);
        
        return arr;
    }
    
    public void dfs(String[] arr, boolean[] visited, String[][] tickets, 
                    String str, int idx){

        if(idx == arr.length) {
            isFinished = true;
            return;
        }
        
        for(int i = 0; i<tickets.length; i++){
            if(!visited[i] && tickets[i][0].equals(str)){
                visited[i] = true;
                arr[idx] = tickets[i][1];
                dfs(arr, visited, tickets, tickets[i][1], idx+1);
                if(isFinished) return;
                visited[i] = false;
            }
        }
    }
}