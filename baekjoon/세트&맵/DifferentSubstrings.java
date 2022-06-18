package baekjoon.setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// BJ_11478
public class DifferentSubstrings {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();

        HashSet<String> subStrings = new HashSet<>();

        for(int i = 1; i <= len; i++) {
            String sub = "";
            for(int j = 0; j < len - i + 1; j++) {
                sub = str.substring(j, j + i);
                subStrings.add(sub);
            }
        }

        System.out.println(subStrings.size());
        
    }

}
