import java.util.*;
class Solution {
    public boolean isValid(String s) {
        //스택에 open이면 넣기. 
        //close 이면 빼기
        //합이 아닌 경우 -> false
        //합이 맞는 경우 제거
        //언제까지? 끝날때 까지
        //판별 스택이 비워져있을 경우 true

        Stack<Character> st = new Stack<>();

        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);

            }else{
                if(!st.isEmpty()){
                    char open_c = st.pop();
                    if((c == ')' && open_c == '(') || (c == '}' && open_c == '{') || (c == ']' && open_c == '[')){
                  
                    }else{
                        return false;
                    }    
                }else{
                    return false;
                }
                
            }
            
        }

        return st.isEmpty() ? true : false;
    }
}