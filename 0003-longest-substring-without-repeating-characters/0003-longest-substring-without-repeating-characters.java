import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++){
            
            while(set.contains(arr[i])){
                set.remove(arr[left]);
                left++;
            }

            set.add(arr[i]);
            max = Math.max(set.size(), max);
            
        }        
    
        return max;
    }
}