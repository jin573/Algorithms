import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        //s의 letter 개수, t의 letter 개수를 저장
        //각각 비교?
        //map을 두 개 사용? 

        
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        for(char c: s.toCharArray()){
            s_map.put(c, s_map.getOrDefault(c, 0) + 1);
        }
        for(char c: t.toCharArray()){
            t_map.put(c, t_map.getOrDefault(c, 0) + 1);
        }

        if(s.length() != t.length()){
            return false;
        }else{
            if(s_map.equals(t_map)){
                return true;
            }else{
                return false;
            }
        }

    }
}