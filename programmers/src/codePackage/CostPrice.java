package codePackage;

import java.util.Stack;

// 프로그래머스 알고리즘 문제
// 코딩테스트 연습 > 스택/큐 > 주식가격
public class CostPrice {

	public static void main(String[] args) {
		int[] prices = {2, 1, 3, 2, 1};
		
//		for(int i : solution(prices)) {
//			System.out.println(i);
//		}
	}
	
	
	// 2. 스택을 사용하여 구현
	public static int[] solution2(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack<Integer>();
		
		
		
		
		return answer;
	}
	
	
	
	
	
	// 1. 이중 반복문, Stack 사용x
	public static int[] solution1(int[] prices) {
		int[] answer = new int[prices.length];

		int len = prices.length;
		for (int i = 0; i < len; i++) {
			if (i == len - 1) {
				answer[i] = 0;
				break;
			}

			int sec = 0;
			for (int j = i + 1; j < len; j++) {
				if (prices[i] <= prices[j]) {
					++sec;
					continue;
				} else {
					answer[i] = ++sec;
					break;
				}

			}
			answer[i] = sec;
		}

		return answer;
	}
}
