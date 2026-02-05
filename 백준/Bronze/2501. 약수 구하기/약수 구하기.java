import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        //1...n 까지 나눔 
        //나눈 수를 sb 에 저장
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                //약수
                count++;
                if(count == k){
                    System.out.print(i);
                    return;
                }
               
            }
        }

        System.out.print(0);
    }
}