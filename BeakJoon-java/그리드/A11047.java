package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class A11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        int[] money_list = new int[n];

        for (int i = 0; i < n; i++) {
            int money = Integer.parseInt(br.readLine());
            money_list[i] = money;
        }

        Arrays.sort(money_list);
        int temp = money_list[n-1];
        int count = 0;

        while (k > 0) {
            if (k >= temp) {
                int a = k / temp;
                k -= temp * a;
                count += a;
            } else {
                temp = money_list[--n - 1];
            }
        }

        System.out.println(count);

    }
}
