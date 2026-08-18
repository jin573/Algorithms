import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //어떻게 접근할까?
        //i랑 i+1를 비교할까? -> i+1에 바로 warmer가 나온다는 보장이 없음
        //반복문 두 번으로? -> 가능은 할듯

        /*
        숫자를 꺼낸다
            나머지를 돌면서 큰 경우가 언제 나오는지 카운트한다
            나오면 종료하고 해당 카운트를 배열에 담는다
            나오지 않으면 0을 담는다
            */
        
        /*
        int[] ans = new int[temperatures.length];

        for(int i = 0; i<temperatures.length -1 ; i++){
            int now = temperatures[i];
            int count = 0;
            boolean val = false;

            for(int j = i+1; j<temperatures.length; j++){
                int fut = temperatures[j];
                count++;

                if(now < fut){
                    val = true;
                    break;
                }
            }

            if(val){
                ans[i] = count;
            }else{
                ans[i] = 0;
            }
        }

        return ans;*/


        /*
        지금 코드 = future가 now보다 시원한지 판별
        답이 정해지지 않은 애들을 stack에 넣고
        답이 정해질 경우 그 stack를 하나씩 꺼내서 빼자
        */

        Stack<Integer> st = new Stack<>();
        int[] arr = new int[temperatures.length];


        for(int i = 0; i<temperatures.length; i++){
            int now = temperatures[i];
            
            //자기 앞이랑 비교
            if(!st.isEmpty()){
                while(!st.isEmpty()){
                    int prev = st.pop();
                    System.out.println(now + " " + prev);

                    if(temperatures[prev] < now){
                        arr[prev] = i - prev;
                    }else{
                        st.push(prev);
                        break;
                    }
                }
            }


            //자기 뒤 랑 비교
            if(i < temperatures.length - 1){
                int next = temperatures[i+1];
                if(now < next){
                    arr[i] = 1;
                }else{
                    st.push(i);
                }
            }
            
        }
        
        return arr;
    }
}