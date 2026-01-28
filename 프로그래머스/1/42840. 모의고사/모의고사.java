import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        Map<String, Integer> map = new HashMap<>();
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == arr1[i % 5]) {
                map.put("1", map.getOrDefault("1", 0) + 1);
            }
            if(answers[i] == arr2[i % 8]){
                map.put("2", map.getOrDefault("2", 0) + 1);
            } 
            if(answers[i] == arr3[i % 10]){
                map.put("3", map.getOrDefault("3", 0) + 1);
            } 
        }
        
        int max = 0;
        
        for(int i : map.values()){
            if(i >= max){
                max = i;
            }
        }
        
        List<Integer> arr = new ArrayList<>();
        for(String s : map.keySet()){
            if(map.get(s) == max){
                arr.add(Integer.parseInt(s));
            }
        }
        
           
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}