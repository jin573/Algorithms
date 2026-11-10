import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //1. 현재 원소를 target에서 뺀다.
        //2. 그 나머지 원소가 map에 있으면 뺀다.
        //3. 그 나머지 원소가 map에 없으면 현재 원소를 넣는다.
    

        Map<Integer, Integer> map = new HashMap<>(); //num,index

        for(int i = 0; i<nums.length; i++){
            int num = target - nums[i];

            if(map.containsKey(num)){
                return new int[]{i, map.get(num)};
            }else{
                map.put(nums[i], i);
            }
        }

        return new int[]{0, 0};
    }
}