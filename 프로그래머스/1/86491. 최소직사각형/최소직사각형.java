class Solution {
    public int solution(int[][] sizes) {
        int w = 0, h = 0, bw = 0, bh = 0;
        
        for(int i = 0; i<sizes.length; i++){
            w = sizes[i][0];
            h = sizes[i][1];
            
            if(w < h){
                int j = w;
                w = h;
                h = j;
            }
            
            if(bw < w){
                bw = w;
            }
            if(bh < h){
                bh = h;
            }
        }
        
        return bw * bh;
    }
}