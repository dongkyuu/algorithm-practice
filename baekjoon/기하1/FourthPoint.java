package baekjoon.geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthPoint {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int[][] arr = new int[3][2];

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int x1 = arr[0][0];
        int y1 = arr[0][1];

        int x2 = arr[1][0];
        int y2 = arr[1][1];

        int x3 = arr[2][0];
        int y3 = arr[2][1];

        int x4 = 0, y4 = 0;

        if(x1 == x2) {
            x4 = x3;
        } else if(x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }

        if(y1 == y2) {
            y4 = y3;
        } else if(y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }

        System.out.println(x4 + " " + y4);
        
    }

}
