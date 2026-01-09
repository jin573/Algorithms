import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> cmap = new HashMap<>();
        
        //put
        for(String str : completion){
            cmap.put(str, cmap.getOrDefault(str, 0) + 1);
        }
        
        //compare
        for(String str: participant){  
            if(cmap.get(str) == null || cmap.get(str) == 0){
                return str;
            }else if(cmap.get(str) != null){
                cmap.put(str, cmap.get(str) - 1);
            }
        }
        return "";
    }
}