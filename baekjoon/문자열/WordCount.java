package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordCount {

    public static int byTrim(String s) {
        String str = s.trim();

        String[] arr = str.split(" ");

        if(arr.length == 1 && arr[0].equals("")) {
            return 0;
        } else {
            return arr.length;
        }
    }

    public static int byStringTokenizer(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");

        return st.countTokens();
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
    
        System.out.println(byTrim(s));
        System.out.println(byStringTokenizer(s));

        br.close();

    }

}
