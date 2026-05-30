import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        
        //어떤 값 i 는 x_start 와 x_end 사이에 있어야 한다. 
        //어떤 값 i 로 최대한 많은 풍선을 터뜨려야 한다.
        
        //정렬을 어떻게 하는지가 관건일듯
        //1. start 기준 오름차순
            //[1, 6] [2, 8] [7, 12] [10, 16]
        //2. start 기준 내림차순
            //[10, 16] [7, 12] [2, 8] [1, 6]
        //3. end 기준 오름차순
            //[1, 6] [2, 8] [7, 12] [10, 16]
        //4. end 기준 내림차순
            //[10, 16] [7, 12] [2, 8] [1, 6]


        //어떤 i를 어떻게 구하지? 
        //0부터 증가시키기 -> 이 i가 범위에 해당한다면 count++ = 너무 비효율적
        //start 기준이 나을까 end 기준이 나을까? = 모르겠음
        
        //어떤 start와 end를 가진다
        //그 다음 원소가 그 범위 안에 걸쳐진다면 = 같이 터뜨릴 수 있다
        //걸치지 않는다면 start와 end를 업데이트한다.

        //Arrays.sort(points, (a, b) -> a[0] - b[0]); //start 기준 오름차순 정렬
        //[[-2147483646,-2147483645],[2147483646,2147483647]] 이 tc에서 오류 걸림

        //Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        /**
        [0, 9]
        [0, 6]
        [2, 9]
        [2, 8]
        [3, 9]
        [3, 8]
        [3, 9]
        [6, 8]
        [7, 12]
        [9, 10]
        에서 오류 발생*/
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int count = 1;
        int start = points[0][0];
        int end = points[0][1];


        for(int i = 0; i<points.length; i++){
            System.out.println("["+ points[i][0] + ", " + points[i][1] +"]");
        }
        for(int i = 1; i<points.length; i++){
            int dx_start = points[i][0];
            int dx_end = points[i][1];

            if(dx_start > end){
                start = dx_start;
                end = dx_end;
                count++;
            }else{
                start = Math.max(start, dx_start);
                end = Math.min(end, dx_end);
            }
        }

        return count;
    }
}