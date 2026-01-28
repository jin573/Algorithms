import java.util.*;
class Solution {
    final static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        char[] carr = numbers.toCharArray();
        boolean[] visited = new boolean[carr.length];
        Arrays.fill(visited, false);
        
        dfs(carr, visited, 0);
    
        int count = 0;
        
        if(set.contains(0)){
            set.remove(0);
        }
        if(set.contains(1)){
            set.remove(1);
        }
       
        for(Integer s: set){
            boolean isPrime = true;
            for(int i = 2; i<s; i++){
                if(s % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) count++;
        }
        
        return count;
    }
    
    private void dfs(char[] carr, boolean[] visited, int num){
        set.add(num);
        
        for(int i = 0; i<carr.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            dfs(carr, visited, Integer.parseInt((num + "") + (carr[i] + "")));
            visited[i] = false;
        }
    }
}