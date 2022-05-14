// no.9020
package baekjoon.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goldbach {

    public static boolean isPrimeNumber(int n) {
        if(n == 1) {
            return false;
        }

        boolean result = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                result = false;
                break;
            }   
        }
        
        return result;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int e = Integer.parseInt(br.readLine());
            int mid = e / 2;
            if(isPrimeNumber(mid)) {
                System.out.println(mid + " " + mid);
            } else {
                for(int j = mid + 1; j < e - 1 ; j++) {
                    if(isPrimeNumber(j) && isPrimeNumber(e - j)) {
                        System.out.println(e - j + " " + j);
                        break;
                    }
                }
            }
        }

        br.close();

    }

}
