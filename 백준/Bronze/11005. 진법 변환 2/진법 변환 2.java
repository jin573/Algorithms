import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count;
        StringBuilder sb = new StringBuilder();
        //나머지를 -> 문자로 변환 
        //숫자가 0이 되는 순간 break
        while(num != 0){
            count = (num % b);
            char c;
            //나머지가 10보다 큰 경우 문자로 변환해야 함.
            if(count >= 10){
                c = (char)(count - 10 + 'A');
            }else{
                c = (char)(count + '0');
            }
            sb.append(c);
            num = num / b;
        }
        
        //거꾸로 읽기
        System.out.print(sb.reverse());
    }
}