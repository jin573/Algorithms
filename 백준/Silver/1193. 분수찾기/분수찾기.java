import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int k = 1;
        int sum = 0;
        //num이 sum값보다 크고 sum+k보다 작을때 까지
        while(!(num > sum && num <= (sum + k))){
            sum = (k*(k+1)) / 2;
            k++;
        }
        
        if(num != 1){
            //num 은 k번째 위치 
            //num은 num - sum에 위치 
            //k가 홀수면
                // num은 [(k+1) - (num-sum)][num - sum]
            //k가 짝수면 
                // num은 [num-sum][(k+1) - (num-sum)]
            int x = (k+1) - (num-sum);
            int y = num - sum;
            if(k % 2 != 0){
                System.out.print(x + "/" + y);
            }else{
                System.out.print(y + "/" + x);
            }
        }else{
            System.out.print("1/1");
        }
    }
}