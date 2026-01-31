class Solution {
    public int solution(int[] numbers, int k) {
        int count = (2 * (k - 1)) % numbers.length;
        
        return numbers[count];
        
    }
}