package codePackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Lv2FunctionDevelopment {

	public static void main(String[] args) {
		int[] progresses1 = {93, 30, 55};
		int[] speeds1 = {1, 30, 5};
		
		int[] progresses2 = {95, 90, 99, 99, 80, 99};
		int[] speeds2 = {1, 1, 1, 1, 1, 1};
				
		for(int e : solution(progresses1, speeds1)) {
			System.out.println(e);
		}
		for(int e : solution(progresses2, speeds2)) {
			System.out.println(e);
		}
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> queue= new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int len = progresses.length;
		int[] answer = {};
		
		for(int i = 0; i < len; i++) {
			if((100 - progresses[i]) % speeds[i] == 0) {
				queue.add((100 - progresses[i]) / speeds[i]); 				
			} else {
				queue.add((100 - progresses[i]) / speeds[i] + 1);
			}
		}
		
		int tmp = -1;
		int count = 1;
		
		while(!queue.isEmpty()) {
			if(tmp < 0) {
				tmp = queue.poll();
			}
			
			if(tmp >= queue.peek()) {
				count++;
				queue.poll();
				if(queue.isEmpty()) {
					al.add(count);
					break;
				}
			} else {
				al.add(count);
				count = 1;
				tmp = queue.poll();
				if(queue.isEmpty()) {
					al.add(count);
					break;
				}
			}
		}
		
		answer = al.stream().mapToInt(v -> v).toArray();
		
		return answer;
	}

}
