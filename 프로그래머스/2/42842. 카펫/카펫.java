class Solution {
    public int[] solution(int brown, int yellow) {
        for(int i = 1; i<=brown+yellow; i++){
            if(((brown+yellow) % i) == 0){
                //두 곱을 나눈 나머지가 0 == 약수
                if(i >= ((brown+yellow) / i)){
                    int width = i;
                    int height = (brown+yellow)/i;
                    
                    if(((width - 2) * (height - 2)) == yellow){
                        return new int[]{width, height}; 
                    }
                    
                }
            }
        }
        
        return new int[]{0, 0};
    }
}