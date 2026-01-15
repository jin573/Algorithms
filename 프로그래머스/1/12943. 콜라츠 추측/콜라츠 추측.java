class Solution {
    public int solution(int num) {
        int i = 0;
        return collatz((long) num, i);
    }
    
    private int collatz(long num, int i){
        if(num == 1) return i;
        if(i >= 500) return -1;
        
        if(num %2 == 0){
            num /= 2;
        }else{
            num = num*3 + 1;
        }

        return collatz(num, i+1);
    }
}