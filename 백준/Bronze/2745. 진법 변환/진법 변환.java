import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        //숫자
        String s = st.nextToken();
        //진법
        int b = Integer.parseInt(st.nextToken());
  
        int sum = 0;
        int num;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
           if(c >= '0' && c <= '9'){
               num = c - '0';
           }else{
               num = c - 'A' + 10;
           }
            
            sum = (sum * b) + num;
            
        }
        System.out.print(sum);
    }
}