package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortInside1 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        String str = br.readLine();
        String[] arr = str.split("");
        
        String tmp = null;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i; j < arr.length; j++) {
                if(Integer.parseInt(arr[i]) < Integer.parseInt(arr[j])) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(String s : arr) {
            sb.append(s);
        }

        System.out.println(sb);

        br.close();

    }

}
