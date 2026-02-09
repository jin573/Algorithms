import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum = 0, max = 0;
        
        for(int i = 0; i<arr.length-2; i++){
            for(int j = i+1; j<arr.length-1; j++){
                for(int k = j+1; k<arr.length; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m && sum >= max){
                        max = sum;
                    }
                }
            }
        }
        
        System.out.print(max);
        
    }
}