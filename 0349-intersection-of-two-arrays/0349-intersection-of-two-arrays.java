import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     //교집합 찾기
     //중복 상관 안씀 
     //num1을 어떤 곳에 저장한 다음 num2 와 비교하면 어떨까? 
     //어떤 곳에 저장할까? 횟수 저장은 필요 없으니까 set이 좋을 거 같음.

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i : nums1){
            set.add(i);
        }

        for(int j : nums2){
            if(set.contains(j)){
                list.add(j);
                set.remove(j);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}