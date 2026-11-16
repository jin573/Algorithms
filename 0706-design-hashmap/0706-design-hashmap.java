import java.util.*;
class MyHashMap {
    //hash 값이 10이라고 가정
    //새로 들어온 값이 있으면 충돌 없이 update 해야됨

    List<List<int[]>> list;

    public MyHashMap() {
        this.list = new ArrayList<>();

        for(int i = 0; i<10; i++){
            list.add(new ArrayList<>());
        }
    }
    
    public void put(int key, int value) {
        //hash 함수를 써서 어느 위치에 넣을지 정하기
        int num = key % 10;

        // 해당 위치의 list 가져오기
        List<int[]> arr = list.get(num);

        // 해당 위치의 list가 비어져있으면 넣기, 아니면 key를 비교하고 update
        if(arr.isEmpty()){
            int[] pair = new int[]{key, value};
            arr.add(pair);
        }else{
            //해당 key가 있는지 확인
            for(int i = 0; i<arr.size(); i++){
                int[] pair = arr.get(i);

                if(pair[0] == key){
                    pair[1] = value;
                    return;
                }
            }

            int[] pair = new int[]{key, value};
            arr.add(pair);
        }
        
    }   
    
    public int get(int key) {
        //해당 key의 hash 값 구하기
        int num = key % 10;

        //해당 key 의 list 가져오기
        List<int[]> arr = list.get(num);
        //해당 위치의 arr이 빈값이면 -1 반환하기
        for(int i = 0; i<arr.size(); i++){

            int[] pair = arr.get(i);

            if(pair[0] == key){
                return pair[1];
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        //해당 key의 hash 값 구하기
        int num = key % 10;

        List<int[]> arr = list.get(num);
    
        for(int i = 0; i<arr.size(); i++){
            int[] pair = arr.get(i);

            if(pair[0] == key){
                arr.remove(i);
                return;
            }
        }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */