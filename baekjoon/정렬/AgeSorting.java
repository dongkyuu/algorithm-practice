package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AgeSorting {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine().split(" ");
        }

        Arrays.sort(arr, (String[] s1, String[] s2) -> {
            return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
        });

        for(int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }

        System.out.println(sb);

        br.close();

    }

}
