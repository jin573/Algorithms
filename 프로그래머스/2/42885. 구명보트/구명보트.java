import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int right = people.length - 1;
        int left = 0;
        int boat = 0;
        
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
                right--;
            }else{
                right--;
            }
            
            boat++;
            
        }
        
        return boat;
    }
}