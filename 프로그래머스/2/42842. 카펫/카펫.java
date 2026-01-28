class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i = 1; i<=yellow; i++){
            if(yellow % i == 0){
                int w = i + 2;
                int h = (yellow / i) + 2;
                
                if(w >= h && (w*h) == (brown+yellow)){
                    answer[0] = w;
                    answer[1] = h;
                }
                
            }
        }
        return answer;
    }
}