import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
  

        for(char c : s.toCharArray()){
            if(c == '(' || c =='[' || c == '{'){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                
                char i = st.pop();

                if((i == '(' && c == ')') || (i == '[' && c == ']') || (i == '{' && c == '}')){
                    continue;
                }else{
                    return false;
                }
            }
        }

        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}