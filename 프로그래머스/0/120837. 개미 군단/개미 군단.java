class Solution {
    public int solution(int hp) {
        //5*x 3*y 1*z 에서 x+y+z를 최소화하기
        int x = hp / 5;
        int y = hp % 5 / 3;
        int z = hp % 5 % 3 / 1;
        
        return x+y+z;
    }
}