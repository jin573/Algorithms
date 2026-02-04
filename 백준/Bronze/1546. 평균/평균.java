import java.util.*;

public class Main{
    public static void main(String[] args){
        //숫자 입력 받기
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        //숫자를 배열에 저장하기
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }
        
        //저장한 숫자 중 최대값 찾기
        long max = 0, sum = 0;
        for(int i=0; i<length; i++){
            //Max 저장 및 sum
            if(max < arr[i]){
                max = arr[i];
            }
            
            sum += arr[i];
        }
        
        //평균 출력하기
        //각 점수 더한 후 100*max로 나누기 그 후 평균내기 
        System.out.print(sum * 100.0 / max / length);
        
    }
}