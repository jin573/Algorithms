class Solution {
    public int solution(int[] numbers, int target) {
        //다 더한게 target 이랑 같으면 -> count 올리기
        //아니면 -> 그냥 pass
        //매번 숫자를 더할 sum 값
        //그리고 그 숫자가 다른 부호일 때? 도 계산
        
        return dfs(target, numbers, 0, 0);
        
    }
    
    public int dfs(int target, int[] numbers, int idx, int sum){
        int cnt = 0;
        
        if(idx == numbers.length){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }
        
        cnt += dfs(target, numbers, idx + 1, sum + numbers[idx]);
        cnt += dfs(target, numbers, idx + 1, sum - numbers[idx]);
        
        return cnt;
    }
}