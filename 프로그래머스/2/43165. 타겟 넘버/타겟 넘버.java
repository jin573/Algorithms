class Solution {
    public int solution(int[] numbers, int target) {
        //0부터 시작
        //배열 / 인덱스 / 타겟 / 총 합
        return dfs(numbers, 0, target, 0);
    }
    
    public int dfs(int[] numbers, int idx, int target, int sum){
        //이번 idx가 배열 길이와 동일하면 target과 비교 후 끝내기
        if(idx == numbers.length){
            if(sum == target) return 1;
            else return 0;
        }
        int count = 0;
        //다음 dfs에 더하기 
        count += dfs(numbers, idx + 1, target, sum + numbers[idx]);
        count += dfs(numbers, idx + 1, target, sum - numbers[idx]);
        
        return count;
    }
}