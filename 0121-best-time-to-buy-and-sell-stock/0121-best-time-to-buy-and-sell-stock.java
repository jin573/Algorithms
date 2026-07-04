class Solution {
    public int maxProfit(int[] prices) {
        //현재 가지고 있는 stock
        //배열을 돌면서 적은 stock이 있으면 변경
        //배열을 돌면서 큰 stock이 나오면 차이를 저장

        int now = prices[0];
        int profit = 0;
        for(int i = 0; i<prices.length; i++){

            if(now >= prices[i]){
                now = prices[i];
            }else{
                profit = Math.max(profit, prices[i] - now);
            }
            
        }

        return profit;
    }
}