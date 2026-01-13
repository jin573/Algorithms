import java.util.*;
class Solution {
    public long solution(long n) {
        String str = n + "";
        char[] carr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(carr);
        
        for(int i = carr.length -1; i >= 0; i--){
            sb.append(carr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}