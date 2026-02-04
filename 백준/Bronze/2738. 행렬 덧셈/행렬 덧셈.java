import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");//N*M
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);

        int[][] arr = new int[n][m];

        for(int k = 0; k<2; k++){
            for(int i = 0; i<n ; i++){
                st = br.readLine().split(" ");
                for(int j = 0; j<m; j++){
                    arr[i][j] += Integer.parseInt(st[j]);
                }
            }
        }


        //arrA+arrB
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}