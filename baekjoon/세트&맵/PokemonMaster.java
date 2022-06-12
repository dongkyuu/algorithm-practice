package baekjoon.setMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PokemonMaster {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> pokemon = new HashMap<>();

        // 포켓몬 이름과 번호를 각각 key, value로 저장하고 반대로 한 번 더 저장
        // 이름과 번호는 각각 중복이 안되므로 위 방식이 가능하다
        // 중복이 가능하다면, 또다른 HashMap을 만들어주면 된다.
        for (int i = 1; i <= n; i++) {
            String pName = br.readLine();
            pokemon.put(pName, String.valueOf(i));
            pokemon.put(String.valueOf(i), pName);
        }

        while (m > 0) {
            sb.append(pokemon.get(br.readLine())).append('\n');
            m--;
        }

        br.close();

        System.out.println(sb);

    }

}
