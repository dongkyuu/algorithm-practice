package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sortingNumber3 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        for(int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())] += 1;
        }
        
        br.close();

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == 0) {
                continue;
            } else if(arr[i] == 1) {
                sb.append(i).append('\n');
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    sb.append(i).append('\n');
                }
            }
        }

        System.out.println(sb);

    }

}