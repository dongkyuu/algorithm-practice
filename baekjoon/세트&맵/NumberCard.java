package baekjoon.setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberCard {

    public static void main(String[] args) throws NumberFormatException, IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stCard = new StringTokenizer(br.readLine());
        boolean[] cardNum = new boolean[20000001];
        
        // 카드의 숫자 중복 X
        for(int i = 0; i < n; i++) {
            cardNum[Integer.parseInt(stCard.nextToken()) + 10000000] = true;
        }
        
        int m = Integer.parseInt(br.readLine());
        StringTokenizer stGiven = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++) {
            int v = Integer.parseInt(stGiven.nextToken());
            if(cardNum[v + 10000000]) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

        br.close();

    }

}
