class Solution {
    public int[] twoSum(int[] nums, int target) {
        //합이 target이 되는 원소 꺼내기. 

        //방법 1. 배열을 돌면서 찾기*브루트포스) -> 이 경우 최악 n2이 걸릴 수 있다.
        
        while(true){

            for(int i = 0; i<nums.length-1; i++){
                for(int j = i+1; j<nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i, j};
                    }
                }
            }
        }
        //방법 2. 더 나은 방법?
    }
}