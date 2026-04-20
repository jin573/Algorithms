import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        //target에 향하는 가장 빠른 경로 -> bfs
        
        Queue<String[]> q = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        q.add(new String[]{begin, 0 + ""});
        
        while(!q.isEmpty()){
            //이번 단어를 꺼냄
            String[] arr = q.poll();
            String str = arr[0];
            int answer = Integer.parseInt(arr[1]);
            //방문한 적 없음
            //본인 아님
            //배열을 돌면서 규칙에 해당하면 q에 넣음
            //backtracking 필요? ㅇㅇ
            for(int i = 0; i<words.length; i++){
                if(!visited[i]){
                    char[] i_arr = words[i].toCharArray();
                    char[] s_arr = str.toCharArray();
                    int cnt = 0;
                    
                    for(int k = 0; k<i_arr.length; k++){
                        if(i_arr[k] != s_arr[k]){
                            cnt++;
                        }
                    }
                    
                    if(cnt == 1){
                        //한 글자만 다르면
                        //q에 넣고 visited 하기
                        if(words[i].equals(target)){
                            answer++;
                            return answer;
                        }
                        answer++;
                        q.add(new String[]{words[i], answer + ""});
                        visited[i] = true;
                        //answer++;
                    }
                    
                }
            }
            
        }
        return 0;
    }
}