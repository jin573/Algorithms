import java.util.*;
class Solution {
    boolean finished = false;
    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        boolean[] visited = new boolean[tickets.length];
        ArrayList<String> arr = new ArrayList<>();
        //icn으로 시작
        arr.add("ICN");
        dfs("ICN", tickets, visited, arr);
        
        return arr.toArray(new String[0]);
    }
    
    public void dfs(String target, String[][] tickets, boolean[] visited,
                   ArrayList<String> arr){
        //언제 종료?
        //다 돌았을 때? 
        if(arr.size() == tickets.length+1){
            finished = true;
        }
        
        
        
        for(int i = 0; i<tickets.length; i++){
            //반복문을 돌면서 들어간 적 없고, 시작 경로에 해당하는 걸 찾음
                //맞으면 target을 tickets[i][1] 로 변경함
            if(!visited[i] && target.equals(tickets[i][0])){
                visited[i] = true;
                arr.add(tickets[i][1]);
                dfs(tickets[i][1], tickets, visited, arr);
                if(finished) return;
                visited[i] = false;
                arr.remove(arr.size() -1);
            }
        }
    }
}