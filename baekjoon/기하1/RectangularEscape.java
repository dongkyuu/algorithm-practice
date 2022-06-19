package baekjoon.geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RectangularEscape {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int minX = x;
        int minY = y;

        if(x >= (w + 1) / 2) {
            minX = w - x;
        }

        if(y >= (h + 1) / 2) {
            minY = h - y;
        }

        int result = minX <= minY ? minX : minY;
        System.out.println(result);

        br.close();
        
    }

}