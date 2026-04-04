class Solution {
    int count = 0;
    public int solution(int[] numbers, int target) {
    //마지막에 합을 구하고 비교 -> 맞으면 count++
        //아니면 백트래킹
        
        dfs(numbers, target, 0 + numbers[0], 1);
        dfs(numbers, target, 0 - numbers[0], 1);
        return count;
    }
    
    public void dfs(int[] numbers, int target, int num, int idx){
        if(idx == numbers.length){
            if(num == target){
                count++;
            }
            return;
        }
        
        dfs(numbers, target, num + numbers[idx], idx+1);
        dfs(numbers, target, num - numbers[idx], idx+1);
        
    }
}