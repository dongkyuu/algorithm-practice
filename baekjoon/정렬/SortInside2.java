package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortInside2 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String str = br.readLine();
        Integer[] arr = new Integer[str.length()];

        // Integer 타입으로 박싱
        for(int i = 0; i < str.length(); i++) {
            arr[i] = Integer.valueOf((int)str.charAt(i) - 48);
        }

        // Comparator.reverseOrder() 사용
        Arrays.sort(arr, Comparator.reverseOrder());

        for(int n : arr) {
            sb.append(n);
        }

        System.out.println(sb);

        br.close();

    }

}