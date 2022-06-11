package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class CoordinateCompression {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb= new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        // 초기 입력값 저장 배열
        int[] arr = new int[n];

        // 배얼에 값 저장
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열의 원소 중, 중복 없이 저장하기 위해 HashSet 사용
        HashSet<Integer> numSet = new HashSet<>();
        
        // HashSet에 배열 arr의 원소 저장 (중복 X)
        for(int i : arr) {
            numSet.add(i);
        }
        
        // HashSet에 있는 원소를 정렬하기 위해 새로운 배열 선언
        int[] notDuplicatedArr = new int[numSet.size()];

        // HashSet에 원소를 뽑아내기 위해 Iterator 선언
        Iterator<Integer> iter = numSet.iterator();

        // 새 배열에 HashSet의 원소 저장
        for(int i = 0; i < numSet.size(); i++){
            notDuplicatedArr[i] = iter.next();
        }

        // 오름차순 정렬
        Arrays.sort(notDuplicatedArr);

        // (값, 자신보다 작은 값의 개수) 쌍으로 저장하기 위해 HashMap 선언
        HashMap<Integer, Integer> numMap = new HashMap<>();

        // HashMap에 (배열의 원소, 그 원소보다 작은 값의 개수) 저장
        for(int i = 0; i < notDuplicatedArr.length; i++) {
            numMap.put(notDuplicatedArr[i], i);
        }

        // 제일 처음에 선언했던 arr 배열의 원소를 key값으로 정답 출력
        for(int i = 0; i < arr.length; i++) {
            sb.append(numMap.get(arr[i])).append(" ");
        }

        System.out.println(sb);

        br.close();

    }

}