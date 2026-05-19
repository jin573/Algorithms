import java.util.*;
class Solution {
    public int maximumTastiness(int[] price, int k) {

     //가장 큰 수 - 그 다음으로 큰 수 의 차이가 답? -> X
     //그러면 모든 조합을 다 찾을까? -> 이 경우 시간 복잡도 O(n^2) 10^10이 되므로 터짐
     //X를 1 부터 키우면서 K 개 만큼 선택하기가 가능한지? 


    Arrays.sort(price);
    boolean isFinished = false;
    int left = 1;
    int right = price[price.length - 1] - price[0];
    int answer = 0;

    while(left <= right){
        int idx = price[0];
        int cnt = 1;
        int x = (left + right) / 2;

        for(int i = 1; i<price.length; i++){
            if(price[i]- idx >= x){
                cnt++;
                idx = price[i];
            }
        }

        if(cnt >= k){
            //x를 키워도 된다
            answer = x;
            left = x + 1;
        }else if(cnt < k){
            //x를 줄여야 한다
            right = x - 1;
        }

    }

    return answer;
    }
}