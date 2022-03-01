package level2;

import java.util.LinkedList;
import java.util.Queue;

public class TruckCrossingBridge {

	public static void main(String[] args) {
		int[] truck_weights = {};
		System.out.println(solution(100, 10, truck_weights));
		
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<Integer> que = new LinkedList<Integer>();
        
        int wtSum = 0;
        int time = 0;
        
        for(int i = 0; i < truck_weights.length; i++) {
    
        	int oneTruckWt = truck_weights[i];
        	
        	while(true) {
        		if(que.isEmpty()) { // 1. 다리가 비어있는 경우
        			que.add(oneTruckWt);
        			time++;
        			wtSum += oneTruckWt;
        			break;
        		} else if(bridge_length > que.size()) { // 2. 다리에 트럭이 꽉 차있지 않은 경우.
        			// 2-1. 다리의 무게 용량이 (다리위에 있는 트럭의 합 + 현재 트럭의 합)보다 클 경우.
        			if(weight >= wtSum + oneTruckWt) {
        				que.add(oneTruckWt);	// 현재 트럭 추가.
        				time++;			// 1초 경과.
        				wtSum += oneTruckWt;	// 현재 트럭 무게 추가.
        				break;
        			} else {	// 2-2. 다리 무게 용량이 더 작을 경우.
        				que.add(0);		// 다리위 트럭들 한 칸씩 이동. (트럭 추가 X)
        				time++;
        			}
        		} else { // 3. 다리에 트럭이 꽉 차있는 경우
        			wtSum -= que.poll();
        		}
        	}
        	
        }
           
        return time + bridge_length;
        
    }
	
}
