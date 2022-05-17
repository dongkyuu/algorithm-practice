package baekjoon.recursion;

public class HanoiTower {
    
    static int cnt = 0;

    public static void hanoi(int n, int a, int b) {

        hanoi(n-1, 1, 2);
        System.out.println(a + " " + b);
        hanoi(n-1, 2, 3);
    }
}