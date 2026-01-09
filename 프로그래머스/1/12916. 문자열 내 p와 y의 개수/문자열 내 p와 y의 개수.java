class Solution {
    boolean solution(String s) {
        int pcount = 0, ycount = 0;
        
        for(char c : s.toCharArray()){
            if(c == 'P' || c == 'p'){
                pcount += 1;
            }else if(c == 'Y' || c == 'y'){
                ycount += 1;
            }
        }

        return pcount==ycount ? true : false;
    }
}