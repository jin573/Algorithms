import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        Map<String, Integer> map = new HashMap<>();
        
        
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == p1[i % p1.length]){
                map.put("1", map.getOrDefault("1", 0) + 1);
            }
            if(answers[i] == p2[i % p2.length]){
                map.put("2", map.getOrDefault("2", 0) + 1);
            }
            if(answers[i] == p3[i % p3.length]){
                map.put("3", map.getOrDefault("3", 0) + 1);
            }
        }
        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: map.values()){
            if(i >= max){
                max = i;
            }
        }
        
        for(String s : map.keySet()){
            if(map.get(s) == max){
                arr.add(Integer.parseInt(s));
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}