package codePackage;

import java.util.Stack;

// 프로그래머스 알고리즘 문제
// 코딩테스트 연습 > 스택/큐 > 주식가격
public class Lv2CostPrice {
	
	// 스택 활용 풀이 체크
	public static void main(String[] args) {
		
		int[] prices = {1,2,3,2,3};
		
		for(int i : solution3(prices)) {
			System.out.println(i);
		}
		
	}
	
	// 2. 스택을 사용하여 구현
	public static int[] solution3(int[] prices) {
		Stack<Integer> stack = new Stack<Integer>();
		int len = prices.length;
		int[] answer = new int[len];
		
		for(int i = 0; i < len; i++) {
			while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
				int tmp = stack.pop();
				answer[tmp] = i - tmp;
			}
			
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			answer[tmp] = len - tmp - 1;
		}
		
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
	
	// 1-1. 이중 반복문 간소화
	public static int[] solution2(int[] prices) {
		int[] answer = new int[prices.length];

		int len = prices.length;
		for (int i = 0; i < len; i++) {
			for(int j = i + 1; j < len; j++) {
				answer[i]++;	
				if(prices[i] > prices[j]) {
					break;
				}
			}
		}
		
		return answer;
	}
	
}
