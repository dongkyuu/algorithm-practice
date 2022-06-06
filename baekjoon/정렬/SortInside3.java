package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortInside3 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String str = br.readLine();
        int[] arr = new int[10];

        for(int i = 0; i < str.length(); i++) {
            arr[(int)str.charAt(i) - 48]++;
        }

        for(int i = arr.length - 1; i >= 0 ; i--) {
            if(arr[i] > 0) {
                while(arr[i] > 0) {
                    sb.append(i);
                    arr[i]--;
                }
            }
        }

        System.out.println(sb);

        br.close();

    }

}
