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
        		if(que.isEmpty()) { // 1. �ٸ��� ����ִ� ���
        			que.add(oneTruckWt);
        			time++;
        			wtSum += oneTruckWt;
        			break;
        		} else if(bridge_length > que.size()) { // 2. �ٸ��� Ʈ���� �� ������ ���� ���.
        			// 2-1. �ٸ��� ���� �뷮�� (�ٸ����� �ִ� Ʈ���� �� + ���� Ʈ���� ��)���� Ŭ ���.
        			if(weight >= wtSum + oneTruckWt) {
        				que.add(oneTruckWt);	// ���� Ʈ�� �߰�.
        				time++;			// 1�� ���.
        				wtSum += oneTruckWt;	// ���� Ʈ�� ���� �߰�.
        				break;
        			} else {	// 2-2. �ٸ� ���� �뷮�� �� ���� ���.
        				que.add(0);		// �ٸ��� Ʈ���� �� ĭ�� �̵�. (Ʈ�� �߰� X)
        				time++;
        			}
        		} else { // 3. �ٸ��� Ʈ���� �� ���ִ� ���
        			wtSum -= que.poll();
        		}
        	}
        	
        }
           
        return time + bridge_length;
        
    }
	
}
