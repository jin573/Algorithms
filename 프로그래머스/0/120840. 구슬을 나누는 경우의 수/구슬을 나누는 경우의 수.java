
class Solution {
    public long solution(int balls, int share) {
        int s = Math.min(share, balls-share);
        long result = 1;
        
        for(int i = 1; i <=s; i++){
            result = result * (balls - i + 1) / i;
        }
        
        return result;
    }
    
}