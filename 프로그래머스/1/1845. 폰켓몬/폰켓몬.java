import java.util.*;
class Solution {
    public int solution(int[] nums) {
        //내부에 있는 종류의 개수가 nums/2 보다 작으면 그 값 리턴
        //내부에 있는 종류의 개수가 nums/2 이면 num/2 리턴
        //내부에 있는 종류의 개수가 nums/2 보다 크면 num/2 리턴
        Set<Integer> hashSet = new HashSet<>();
        for(int i : nums){
            hashSet.add(i);
        }
        
        return hashSet.size() < nums.length/2 ? hashSet.size() : nums.length/2;
    }
}