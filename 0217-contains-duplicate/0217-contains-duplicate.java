import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //현재 원소가 등장 했는지 안했는지 판단하는 로직이 필요함 -> 횟수가 필요한가? no -> Set
        //한번이라도 등장했으면 true, 아니면 false 반환하기
        //1. 현재 원소
        //2. set에 있으면 -> true
        //3. set에 없으면 input
        //4. 배열의 끝까지? 


        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            int now = nums[i];

            if(set.contains(now)){
                return true;
            }else{
                set.add(now);
            }
        }

        return false;

    }
}