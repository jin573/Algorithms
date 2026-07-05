class Solution {
    public int maxArea(int[] height) {

        //최대 면적 구하기
        //면적 = (big(i) - small(i)) * Min(big(i), small(i))   
        //어떻게 두 i를 선택하지?

        //방법 1. 브루트포스로 모두 탐색하기 -> 너무 무식
        //방법 2. 투 포인터로 양쪽에서 줄이기? 
        //줄이는 기준을 무엇으로?
        //값이 클 수록 좋으니까, 두 포인터 중에 작은 값을 pass 할까? 

        int left = 0;
        int right = height.length -1;
        int max_container = 0;


        while(left < right){

            //면적 구하기
            int container = (right - left) * Math.min(height[left], height[right]);

            //이전 면적보다 작으면 -> 값이 업데이트 되어야 함.
            //이전 면적보다 크면 -> 이전 면적으로 업데이트
            if(container > max_container){
                max_container = container;   
            }

            
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }

        }


        return max_container;

    }
}