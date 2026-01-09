import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        int count = strings.length - 1;

        while(count > 0){
           for(int i = 0; i<count; i++){
                if(strings[i].charAt(n) > strings[i+1].charAt(n)){
                    String str = strings[i];
                    strings[i] = strings[i+1];
                    strings[i+1] = str;
                }else if(strings[i].charAt(n) == strings[i+1].charAt(n)){
                    String[] arr = {strings[i], strings[i+1]};
                    Arrays.sort(arr);
                    strings[i] = arr[0];
                    strings[i+1] = arr[1];
                }
            } 
            count--;
        }
        return strings;
    }
}