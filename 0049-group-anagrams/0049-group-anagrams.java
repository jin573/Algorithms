import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //단어 하나를 꺼낸다
        //해당 단어를 char 로 정렬한다.-> 너무 오래 걸릴 거 같은데 정렬 말고 다른방법 없나? 
        //그 단어가 있으면 리스트에 추가한다

        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i<strs.length; i++){
            
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            //해당 단어가 key로 존재하면? value 뒤에 넣기
            //존재하지 않는다면? 새로 만들기
            if(map.containsKey(sorted)){
                List<String> list = map.get(sorted);
                list.add(strs[i]);

            }else{
                List<String> new_list = new ArrayList<>();
                new_list.add(strs[i]);
                map.put(sorted, new_list);
            }
        }

        return new ArrayList<>(map.values());      
    }
}