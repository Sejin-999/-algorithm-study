package 동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split(" ");
        int N = Integer.parseInt(inputs[0]); // 물품의 수
        int K = Integer.parseInt(inputs[1]); // 버틸 수 있는 무게

        int dp[][] = new int[N + 1][K + 1];
        int[] w = new int[N]; // 무게
        int[] v = new int[N]; // 가치

        for (int i = 0; i < N; i++) {
            String wv = br.readLine();
            String[] wvs = wv.split(" ");

            w[i] = Integer.parseInt(wvs[0]); // 무게 배열
            v[i] = Integer.parseInt(wvs[1]); // 가치 배열
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = dp[i - 1][j];

                if (j - w[i - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
