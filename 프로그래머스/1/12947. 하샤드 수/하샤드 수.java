class Solution {
    public boolean solution(int x) {
        String str = x + "";
        
        int sum = 0;
        for(char c : str.toCharArray()){
            sum += c - '0';
        }
        
        return x % sum == 0 ? true : false;
    }
}