class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(0, 0, numbers, target, 0);//현재 인덱스, sum값
    }
    
    private int dfs(int index, int sum, int[] numbers, int target, int count){
        if(index == numbers.length){
            if(sum == target) count++;
            return count;
        }
        
        count = dfs(index + 1, sum + numbers[index], numbers, target, count);
        count = dfs(index + 1, sum - numbers[index], numbers, target, count);
        
        return count;
    }
}