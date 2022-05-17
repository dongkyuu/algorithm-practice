package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower {
    
    static int cnt = 0;

    public static void hanoi(int n, int start, int end, int tmp, StringBuilder sb) {

        if(n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }

        hanoi(n-1, start, tmp, end, sb);
        sb.append(start + " " + end + "\n");
        hanoi(n-1, tmp, end, start, sb);
        
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        hanoi(n, 1, 3, 2, sb);
        
        System.out.println(sb.length() / 4);
        System.out.println(sb);

    }
    
}
