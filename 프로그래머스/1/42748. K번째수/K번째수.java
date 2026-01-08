import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        List<Integer> list;
        
        for(int i=0; i<commands.length; i++){
            //cp
            int start = commands[i][0];
            int end = commands[i][1];
            int cnt = commands[i][2];
            list = new ArrayList<>();
            
            for(int j = start; j<=end; j++){
                list.add(array[j-1]);
            }
            //sort
            Collections.sort(list);
            
            answer[i] = list.get(cnt-1);
        }
        return answer;
    }
}