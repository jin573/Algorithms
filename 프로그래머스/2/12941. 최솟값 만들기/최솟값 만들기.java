import java.util.*;
class Solution{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int[] arr = new int[B.length];
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = B[(arr.length - 1) - i];
        }
        
        int cnt = 0;
        
        for(int i = 0; i<arr.length; i++){
            cnt += A[i] * arr[i];
        }
        
        return cnt;
    }
}