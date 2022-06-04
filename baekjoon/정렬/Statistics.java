package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[8001];

        int sum = 0;
        int min = 4001;
        int max = -4001;
        int median = 0;
        int mode = 0;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[num + 4000]++;

            if(num > max) {
                max = num;
            }

            if(num < min) {
                min = num;
            }
        }

        int medianCnt = 0;
        int modeCntMax = 0;
        boolean flag = false;

        for(int i = min + 4000; i <= max + 4000; i++) {
            
            if(arr[i] > 0) {
                
                // 중앙값 찾기
                if(medianCnt < (n + 1 ) / 2) {
                    medianCnt += arr[i];
                    median = i - 4000;
                }

                // 최빈값 찾기
                if(arr[i] > modeCntMax) {
                    modeCntMax = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if(arr[i] == modeCntMax && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }

            }
            
        }


        // 산술 평균
        System.out.println((int)Math.round((double)sum / n));

        // 중앙값
        System.out.println(median);

        // 최빈값
        System.out.println(mode);

        // 범위
        System.out.println(max - min);

    }

}
