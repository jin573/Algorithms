import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> carr = new HashMap<>();
        
        //put
        for(String s : completion){
            carr.put(s, carr.getOrDefault(s, 0) + 1);
        }
        
        //get
        for(String s : participant){
            if(carr.get(s) != null && carr.get(s) != 0){
                carr.put(s, carr.get(s) - 1);
            }else{
                return s;
            }
        }
        
        return "";
    }
}