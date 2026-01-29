import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> arr = new HashMap<>();
        
        for(int i = 0; i<clothes.length; i++){
            String str = clothes[i][1];
            arr.put(str, arr.getOrDefault(str, 1) + 1);
        }
        
        int count = 1;
        for(int i : arr.values()){
            count *= i;
        }

        return count - 1;
    }
}