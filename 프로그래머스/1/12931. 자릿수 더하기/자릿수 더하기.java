
public class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        for(char c : str.toCharArray()){
            sum = sum + (c - '0');
        }
       return sum;
    }
}