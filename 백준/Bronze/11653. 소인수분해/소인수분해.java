import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        //2로 무한정 나누기 
        //그 후 홀수로만 나누기 
        while(true){
            if(num % 2 == 0){
                System.out.println(2);
                num = num / 2;
            }else break;
        }
        
        int i = 3;
        while(true){   
            if(num == 1) return;
            if(num % i == 0){
                System.out.println(i);
                num = num / i;
            }else{
                i += 2;
            }
        }
    }
}