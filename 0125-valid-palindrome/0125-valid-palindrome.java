class Solution {
    public boolean isPalindrome(String s) {
        //방법1
        //1. lowercase 로 변경
        //2. 뒤집기
        //3. 기존 string과 비교
    
        //방법2
        //1. lowercase 로 변경
        //2. 양쪽에서 하나씩 확인
        //3. 하나라도 다르면? false

        s = s.toLowerCase();

        int pt1 = 0;
        int pt2 = s.length() -1;

        while(pt1 < pt2){
            if((s.charAt(pt1) < 'a' || s.charAt(pt1) > 'z')
            && (s.charAt(pt1) < '0' || s.charAt(pt1) > '9')){
                pt1++;
                continue;
            }

            if((s.charAt(pt2) < 'a' || s.charAt(pt2) > 'z')
            && (s.charAt(pt2) < '0' || s.charAt(pt2) > '9')){
                pt2--;
                continue;
            }

            if(s.charAt(pt1) != s.charAt(pt2)){
                return false;
            } 

            pt1++;
            pt2--;
        }

        return true;   
    }
}