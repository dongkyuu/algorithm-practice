package baekjoon.setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class NotListenSee {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> nameSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            nameSet.add(br.readLine());
        }

        int cnt = 0;
        
        for(int i = 0; i < m; i++) {
            
            String name = br.readLine();
            
            if(nameSet.contains(name)) {
                cnt++;
                sb.append(name).append('\n');
            }

        }

        String[] nameArr = String.valueOf(sb).split("\n");
        Arrays.sort(nameArr);
        sb.delete(0, sb.length());

        for(String name : nameArr) {
            sb.append(name).append('\n');
        }
        
        System.out.println(cnt);
        System.out.println(sb);
        br.close();

    }

}
