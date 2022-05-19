package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class MeetingTime {

    private int start = 0;
    private int end = 0;

    public MeetingTime(int start, int end) {
        
        this.start = start;
        this.end = end;

    }

    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }

}

public class MeetingRoom {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<MeetingTime> al = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            MeetingTime mt = new MeetingTime(start, end);

            al.add(mt);
        }

        while(al.size() != 0) {

            for(int i = 0; i < al.size(); i++) {
                int end = al.get(i).getEnd();
                for(int j = i + 1; j < al.size(); j++) {
                    if(al.get(j).getStart() >= end) {
                        
                    }
                }

            }
        }


        for(MeetingTime m : al) {
            System.out.println(m.getStart() + " " + m.getEnd());
        }

    }

}
