package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
    
    static String[][] arr;

    public static void getStar(int x, int y, int n) {

        if(n == 1) {
            arr[x][y] = "*";
            return;
        }

        int size = n / 3;

        for(int i = x; i < n; i++) {
            for(int j = y; j < n; j++) {
                if((i >= size && i < size*2) && (j >= size && j < size*2)) {
                    arr[i][j] = " ";
                } else {
                    getStar(i, j, size);
                }
            }
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new String[n][n];

        getStar(0, 0, n);

        System.out.println(arr[1][2]);

    }
}
