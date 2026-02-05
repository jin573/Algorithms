import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] arr = new int[100][100];
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int c = 0; c<count; c++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()); //열
            int x = Integer.parseInt(st.nextToken()); //행
            
            for(int i = x; i<x+10; i++){
                for(int j = y; j<y+10; j++){
                    arr[i][j] = 1;
                }
            }
        }
        
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == 1){
                    sum++;
                }
            }
        }
        
        System.out.print(sum);
    }
}