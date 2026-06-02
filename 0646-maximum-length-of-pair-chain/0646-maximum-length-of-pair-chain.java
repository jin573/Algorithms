import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {
        //끝값 < 다음 원소의 시작값 일 경우 연결 가능
        //가장 길게 만드는 것이 목적
        //그렇다면? 끝값이 가장 작을 수록 유리하겠다?


        //시작값또한 작을 수록 유리
        
        Arrays.sort(pairs, (a, b) -> {
            if(a[0] == b[0]){
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]); 
        });


        for(int i = 0; i<pairs.length; i++){
            System.out.println(pairs[i][0] + " " + pairs[i][1]);
        }


        int count = 1;
        int end = pairs[0][1];
        int latest_end = end;

        for(int i = 1; i<pairs.length; i++){
            //이번 원소의 시작값을 구하기
            int start = pairs[i][0];

            //end 가 start 보다 작으면 연결 가능
            if(latest_end < start){
                count++;
                latest_end = pairs[i][1];
            }else{
                latest_end = Math.min(latest_end, pairs[i][1]);
                System.out.println("pass and now: " + latest_end);
            }
        }

        return count;

    }
}