import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
/*
        //첫 번째 원소에 맞게 정렬
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //안겹치려면? 
        //시작 원소가 starti, endi 보다 작을때 & endi와는 같아도 됨
        //끝 원소가 starti, endi 보다 작을때  & starti와는 같아도 됨

        //배열의 끝에서부터 보는게 유리하다? 
        int count = 0;
        for(int i = intervals.length -1; i>0; i--){
            //기준
            int starti = intervals[i][0];
            int endi = intervals[i][1];

            //비교
            int startj = intervals[i-1][0];
            int endj = intervals[i-1][1];

            //안겹친다면 -> pass
            //겹친다면 -> 해당 원소 카운트 -> i update
            if(endj > starti){
                count++;
                i = i-1;
            }

        } //누구를 제거해야 할까? 

        return count;
        */

        //endi가 큰걸 먼저 제거해야 한다
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        boolean[] visited = new boolean[intervals.length];

        int count = 0;
        for(int i = 0; i<intervals.length-1; i++){
            int starti = intervals[i][0];
            int endi = intervals[i][1];
            System.out.println("기준: " + i);

            if(visited[i] == false){
                for(int j = i+1; j<intervals.length; j++){
                    int startj = intervals[j][0];
                    int endj = intervals[j][1];

                    if(startj < endi && visited[j] == false){
                        System.out.println("제거: " + j);
                        count++;
                        visited[j] = true;
                    }
                }
            }
        }

        return count;
    }
}