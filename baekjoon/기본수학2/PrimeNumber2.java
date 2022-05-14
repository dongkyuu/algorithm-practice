package baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PrimeNumber2 {
    
    public static ArrayList<Integer> getPrimeNumber(int m, int n) {
        int[] arr = new int[n+1];

        for(int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(arr[i]==0) {
                continue;
            }

            for(int j = 2 * i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        for(int i = m; i <= n; i++) {
            if(arr[i] != 0) {
                al.add(arr[i]);
            }
        }
        return al;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i : getPrimeNumber(m, n)) {
            System.out.println(i);
        }

        br.close();

    }
}
