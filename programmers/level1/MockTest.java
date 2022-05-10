package level1;

import java.util.LinkedList;
import java.util.Queue;

public class MockTest {

	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		for(int i : solution(answers)) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] answers) {
		Queue<Integer> que = new LinkedList<Integer>();
        int len = answers.length;
        int[] firstNums = {1, 2, 3, 4, 5};
        int[] secondNums = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdNums = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;
        
        // 각 학생들이 맞춘 정답 개수 구하기
        for(int i = 0; i < len; i++) {
        	if(firstNums[i%5]==answers[i]) {
        		firstCnt++;
        	} 
        	if(secondNums[i%8]==answers[i]) {
        		secondCnt++;
        	}
        	if(thirdNums[i%10]==answers[i]) {
        		thirdCnt++;
        	}
        }
        
        // 가장 높은 점수를 받은 학생을 오름차순으로 정렬
        // 두 번째 방법 - Math.max() 활용
        int maxNum = Math.max(firstCnt, Math.max(secondCnt, thirdCnt));
        if(maxNum == firstCnt) {
        	que.add(1);
        }
        if(maxNum == secondCnt) {
        	que.add(2);
        } 
        if(maxNum == thirdCnt) {
        	que.add(3);
        }
        
        int[] answer = new int[que.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = que.poll();
        }
        
        return answer;
        
        // 나의 첫번째 방법 - 너무 복잡하다.
//        que.add(1);
//        if(firstCnt > secondCnt) {
//        	if(firstCnt < thirdCnt) {
//        		que.poll();
//        		que.add(3);
//        	}else if(firstCnt == thirdCnt) {
//        		que.add(3);
//        	}
//        }else if(firstCnt < secondCnt){
//        	que.poll();
//        	que.add(2);
//        	if(secondCnt < thirdCnt) {
//        		que.poll();
//        		que.add(3);
//        	}else if(secondCnt == thirdCnt) {
//        		que.add(3);
//        	}
//        }else {	// firstCnt == secondCnt
//        	que.add(2);
//        	if(secondCnt < thirdCnt) {
//        		que.poll();
//        		que.poll();
//        		que.add(3);
//        	}else if(secondCnt == thirdCnt) {
//        		que.add(3);
//        	}
//        }
        
//        int[] answer = new int[que.size()];
//        for(int i = 0; i < answer.length; i++) {
//        	answer[i] = que.poll();
//        }
//        
//        return answer;
        
    }
}
