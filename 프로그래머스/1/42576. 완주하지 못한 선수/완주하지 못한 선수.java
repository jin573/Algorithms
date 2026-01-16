import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        //완주자 넣기 
        //참여자 - 완주자? 
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i<participant.length - 1; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
       
        return participant[participant.length-1];
    }
}