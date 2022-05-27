package baekjoon.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieDirector666 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int num = 666;

        while(cnt != n) {

            num++;

            if (String.valueOf(num).contains("666")) {
                cnt++;
            }

        }

        System.out.println(num);

        br.close();

    }

}
