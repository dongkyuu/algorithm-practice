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




        

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new String[n][n];

        getStar(0, 0, n
        );

    }
}
