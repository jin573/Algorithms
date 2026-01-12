class Solution {
    public int[] solution(long n) {
        StringBuilder str = new StringBuilder(String.valueOf(n));
        int[] arr = new int[str.length()];
        
        str.reverse();
        
        for(int i = 0; i<str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }
}