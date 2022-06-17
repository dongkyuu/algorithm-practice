package baekjoon.setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NumberCard2 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 카드 숫자 개수 입력
        int n = Integer.parseInt(br.readLine());
        
        // 카드 숫자들 입력
        StringTokenizer stNumbers = new StringTokenizer(br.readLine());
        
        HashMap<String, Integer> cardMap = new HashMap<>();
        
        for(int i = 0; i < n; i++) {

            // 숫자 문자열 중 하나의 숫자 추출
            String number = stNumbers.nextToken();
            
            if(!cardMap.containsKey(number)) {  // cardMap에 숫자를 키로 가지고 있지 않다면, value = 1 입력
                cardMap.put(number, 1);
            } else {    // cardMap에 숫자를 키로 가지고 있다면, 해당 value값에 1을 더하여 입력
                cardMap.put(number, cardMap.get(number) + 1);
            }
            
        }
        
        int m = Integer.parseInt(br.readLine());

        // 체크용 숫자들 입력
        StringTokenizer stGiven = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {

            String givenNumber = stGiven.nextToken();

            if(!cardMap.containsKey(givenNumber)) {
                sb.append(0).append(" ");
            } else {
                sb.append(cardMap.get(givenNumber)).append(" ");
            }
            
        }

        br.close();
        System.out.println(sb);

    }

}
