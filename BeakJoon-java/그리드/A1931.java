package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class A1931 {
    public static void main(String[] args) throws IOException {
        int temp = 0;
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            time[i][0] = Integer.parseInt(inputs[0]);
            time[i][1] = Integer.parseInt(inputs[1]);
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]); // 끝나는 시간이 같을 경우 시작 시간으로 정렬
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int i = 0; i < n; i++) {
            if (time[i][0] >= temp) { // 다음 회의의 시작 시간이 이전 회의의 끝나는 시간보다 크거나 같은 경우
                temp = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
