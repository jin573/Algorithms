import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        
        int start = 2;
        for(int i = 0; i<s; i++){
            start = (start * 2) - 1;
        }
        
        System.out.print(start*start);
        
    }
}