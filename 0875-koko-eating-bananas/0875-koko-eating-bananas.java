import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //시간 당 몇개의 바나나를 먹어야 h 전에 다 먹을 수 있을까?

        //뭔가 수학적 접근 방법이 맞아보이기도 하고?
        //h 이하로 접근하면 ok

        //3나누기 4 는 몫이 0이고 나머지 3 -> 1로 취급
        //( 각 원소를 k로 나눈 다음 +1 ) -> 이게 h보다 같거나 작은 k를 구하는 문제?

        //방법 1. k를 큰 원소 -- 로 하던지 작은 원소 ++로 하던지 모든 경우를 다 구하는 방법 -> 너무 많아
        //방법 2. 일단 정렬을 할까? [4, 11, 20, 23, 30] -> 이진검색?

        Arrays.sort(piles);

        int right = piles[piles.length -1];
        int left = 1;
        int answer = 0;

        while(right >= left){
            long ans = 0;
            int mid = left + (right - left) / 2;

            //각 배열을 돌면서 검사
            for(int i = 0; i<piles.length; i++){
                int idx_1 = piles[i] / mid;
                int idx_2 = piles[i] % mid;

                if(idx_2 == 0){
                    ans += idx_1;
                }else{
                    ans += (idx_1 + 1);
                }
            }

            if(ans <= h){
                answer = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return answer;
    }
}