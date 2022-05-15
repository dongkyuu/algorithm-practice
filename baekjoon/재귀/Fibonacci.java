package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    
    public static int fibo(int n) {
        int result = 0;
        
        if(n == 0) {
            return 0; 
        } else if(n == 1) {
            return 1;
        } else {
            result = fibo(n-1) + fibo(n-2);
        }

        return result;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibo(n));

    }
}
