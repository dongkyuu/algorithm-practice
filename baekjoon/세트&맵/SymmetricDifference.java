package baekjoon.setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

// BJ_1269
public class SymmetricDifference {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        StringTokenizer numbersA = new StringTokenizer(br.readLine());
        StringTokenizer numbersB = new StringTokenizer(br.readLine());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        
        for(int i = 0; i < a; i++) {
            setA.add(Integer.parseInt(numbersA.nextToken()));
        }

        for(int i = 0; i < b; i++) {
            setB.add(Integer.parseInt(numbersB.nextToken()));
        }

        int commonCnt = 0;
       
        Iterator<Integer> iterB = setB.iterator();

        while(iterB.hasNext()) {
            if(setA.contains(iterB.next())) {
                commonCnt++;
            }
        }

        // for(int number : setB) {
        //     if(setA.contains(number)) {
        //         commonCnt++;
        //     }
        // }
        
        System.out.println(setA.size() + setB.size() - commonCnt*2);
        br.close();

    }

}
