import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i<numbers.length - 1; i++){
            for(int j = i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(!arr.contains(sum)){
                    arr.add(sum);
                }
            }
        }
        Collections.sort(arr);
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}