import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        //횟수
        int count = discount.length - 10 + 1; //14 -> 5
        int sum = 0;
        
        for(int i = 0; i<count; i++){
            boolean pass = false;
            Map<String, Integer> map = new HashMap<>();
            
            for(int j = i; j<i+10; j++){
                map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
            }
            
            //비교하기
            for(int k = 0; k<want.length; k++){
                //하나라도 다르면 break
                if(map.get(want[k]) == null || map.get(want[k]) != number[k]){
                    pass = true;
                    break;  
                }
            }
            
            if(!pass) sum++;
        }
        
        return sum;
    }
}