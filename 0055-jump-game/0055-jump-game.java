import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
        //0번째 원소에서 시작해서
        //최대 nums[i] 위치로 이동 가능
        //가능하다면 true, 불가능하다면 false


        
        /*

        //스택으로?
        int idx = 0;
        Stack<int[]> s = new Stack<>();
        s.add(new int[]{idx, nums[idx]}); //[0, nums[0]]

        //원소를 꺼내기
        while(true){
            int[] arr = s.pop();
            int now = arr[0]; //현재 위치 인덱스
            int range = arr[1];//최대 점프 수

            //0인경우
            if(nums[now] == 0){
                if(now == nums.length-1){//0이지만 마지막 위치인 경우 true
                    return true;
                }else{//중간 원소가 0인 경우 false
                    return false;
                }
            }

            if(now == nums.length - 1){
                return true;
            }else{
                //원소 넣기
                for(int i = 1; i<=range; i++){
                    int next = now + i;
                    if(next < nums.length){
                        s.add(new int[]{now + i, nums[now + i]}); //[1, nums[1]] 
                    }
                   
                }

            }
        }

        */

        /*
        //현재 위치
        //갈 수 있는 가장 먼 곳
        //그 곳이 0이라면 false
        //그 곳이 0이 아니라면 length 를 넘을 때 까지 진행 후 true
        
        
        //현재 위치&원소값
        int idx = 0;

        while(true){

            int jump = nums[idx];
            int len = idx + jump;
            
            if(len >= nums.length){
                return true;
            }else{
                int next = nums[len];
                if(next == 0){
                    return false;
                }
            }
            

            idx += jump;
        }
        */


        //반복문을 돌면서
        //i가 내 최대 범위보다 작은 경우 ->  범위 업데이트
        //i가 내 최대 범위보다 큰 경우 -> 도달 못함 -> false

        int idx = 0;
        int reachable = idx + nums[idx];

        for(int i = 0; i<nums.length; i++){
            if(i > reachable){
                return false;   
            }else{
                if(i + nums[i] > reachable){
                    reachable = i + nums[i];
                }
            }
        }

        return true;
        
    }
}