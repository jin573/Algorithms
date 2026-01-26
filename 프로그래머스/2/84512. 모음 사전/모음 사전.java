class Solution {
    public int solution(String word) {
        char[] str = word.toCharArray(); 
        //625 125 25 5 1
        int[] weight = {781, 156, 31, 6, 1};
        int answer = 0;
        for(int i = 0; i<str.length; i++){
          if(str[i] == 'A'){
              answer += 0 * weight[i] + 1;
          }else if(str[i] == 'E'){
              answer += 1 * weight[i] + 1;
          }else if(str[i] == 'I'){
              answer += 2 * weight[i] + 1;
          }else if(str[i] == 'O'){
              answer += 3 * weight[i] + 1;
          }else if(str[i] == 'U'){
              answer += 4 * weight[i] + 1;
          }
        }
        
        return answer;
    }
}