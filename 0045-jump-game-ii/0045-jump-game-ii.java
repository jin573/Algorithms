import java.util.*;

class Solution {
    public int jump(int[] nums) {
        //적은 횟수로 점프하기
        //0에서 시작
        //(i + 최대 nums[i]) 만큼 점프할 수 잇음 


        //무슨 알고리즘으로 풀 것인가?
        //Q? -> 모든 경우를 다 봐야함, 백트래킹 필요, 범위가 너무 크다
        //그리디? -> 멀리 가기만 하면 됨, (i + j) 가 도달 가능하기만 하면 됨

        //배열을 반복하면서 도달 범위가 더 큰걸로 update하고 그 경우 count를 1++한다
        //만약 [0, ?? ] 이라면? 0이어야 함
/*
        int idx = 0;
        int reachable = idx + nums[idx];
        
        if(reachable == 0){
            return 0;
        }
        if(nums.length -1 == 0){
            return 0;
        }

        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(i + nums[i] >= reachable){
                
                if(i + nums[i] < nums.length){
                    reachable = Math.max(reachable, i + nums[i]);
                }else{
                    reachable = nums.length -1;
                }

                count++;
            }

            if(reachable == nums.length - 1){
                return count;
            }            
        }

        return count;
*/


    //갈 수 있는 범위를 벗어날 때 count를 증가해야 함
    //갈 수 있는 범위는 i + nums[i]

        int idx = 0;
        int currentEnd = 0; 
        int farstest = 0; 
        int count = 0;

        for(int i = 0; i<nums.length-1; i++){
            
            //만약 갈 수 있는 가장 먼 값에 도착한다면
            //해당 위치에서 업데이트 되어야 함
            farstest = Math.max(farstest, i + nums[i]);
            if(i == currentEnd){
                currentEnd = farstest;
                count++;
            }

        }

        return count;
    }
}