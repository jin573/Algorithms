import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //횟수가 중요한 문제인가? ㅇㅇ
        //1. "eat" -> e가 1번 a가 1번 t가 1번 -> 기존 자료구조에 해당 정보 없음 -> 담음
        //2. "tea" -> t가 1번 e가 1번 a가 1번 -> 기존 다료구조에 해당 정보 있음 -> 같은 list에 add


        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            char[] carr = strs[i].toCharArray(); //string 을 정렬
            Arrays.sort(carr);
            String str = new String(carr);

            //해당 str 로 되는 key가 없는 경우 새 map을 만듦
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }

            //해당 map을 가져와 value 넣기
            List<String> list = map.get(str);
            list.add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}