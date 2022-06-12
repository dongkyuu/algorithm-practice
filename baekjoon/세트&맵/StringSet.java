package baekjoon.setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class StringSet {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> strSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            strSet.add(br.readLine());
        }
        
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            String v = br.readLine();
            if(strSet.contains(v)) {
                cnt++;
            }
        }

        System.out.println(cnt);

        br.close();
        
    }

}
