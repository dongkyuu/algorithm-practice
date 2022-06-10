package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class WordSorting {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb= new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {    // compareTo() : 사전순 정렬
                    return s1.compareTo(s2);
                }

                return s1.length() - s2.length();
            }

        });

        sb.append(arr[0]).append('\n');

        for(int i = 1; i < arr.length; i++) {    
            if(!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }

        System.out.println(sb);

        br.close();

    }

}
