class Solution {
    public int[] solution(String s) {
        //글자가 1이 될 때 까지 반복
        //제거할 0의 개수를 누적 합
        //제거 후 길이를 이진 변환
        int cnt = 0;
        int sum = 0;
        while(!s.equals("1")){
            StringBuilder sb = new StringBuilder(s);
            int num = 0;
            
            for(int i= 0; i<s.length(); i++){
                if(sb.charAt(i) == '0'){
                    num++;
                    cnt++;
                }
            }
            
            int len = s.length() - num;
            String str = "";
            while(len != 0){
                str += ((len % 2) + "");
                len = len/2;
            }
        
            s = str;
            sum++;
        }
        
        return new int[]{sum, cnt};
    }
}