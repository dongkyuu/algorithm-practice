package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SangSu {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 = st.nextToken();
        String num2 = st.nextToken();

        StringBuffer sb1 = new StringBuffer(num1);
        StringBuffer sb2 = new StringBuffer(num2);

        String reverse1 = sb1.reverse().toString();
        String reverse2 = sb2.reverse().toString();

        if(Integer.parseInt(reverse1) > Integer.parseInt(reverse2)) {
            System.out.println(reverse1);
        } else {
            System.out.println(reverse2);
        }
        
    }
}
