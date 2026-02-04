import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        //9*9 배열
        //최댓값의 값과 위치 반환하기 
        
        //배열을 만들까 or readLine으로 처리할까? 
        //readLine으로 처리하면 반복 횟수를 저장해야 됨
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0; //최댓값
        int x = 0, y = 0;//위치
        StringTokenizer st;
        for(int i = 0; i<9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num >= max){
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.print((x+1) + " " + (y+1));
        
    }
}