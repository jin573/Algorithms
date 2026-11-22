import java.util.*;

class MyHashMap {

    List<List<int[]>> list = new ArrayList<>();

    public MyHashMap() {
        
        //리스트 초기화
        for(int i = 0; i<10; i++){
            List<int[]> n_list = new ArrayList<>();
            list.add(n_list);
        }        
    }
    
    public void put(int key, int value) {
        //key의 해시 값 구하기
        int hash = key % 10;
        //해당 line에서 key가 있으면 update, 없으면 input

        List<int[]> h_list = list.get(hash);
        for(int i = 0; i<h_list.size(); i++){
            int[] arr = h_list.get(i);

            if(arr[0] == key){
                arr[1] = value;
                return;
            }
        }

        h_list.add(new int[]{key, value});
    }
    
    public int get(int key) {
        int hash = key % 10;

        //hash 행을 가져오기
        List<int[]> h_list = list.get(hash);
        for(int i = 0; i<h_list.size(); i++){
            int[] arr = h_list.get(i);

            if(arr[0] == key){
                return arr[1];
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        int hash = key % 10;

        List<int[]> h_list = list.get(hash);
        for(int i = 0; i<h_list.size(); i++){
            int[] arr = h_list.get(i);

            if(arr[0] == key){
                h_list.remove(i);
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