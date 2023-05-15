package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);
        int total_time = 0;
        int temp_time = 0;

        for(int i = 0; i < n; i++){
            temp_time += arr[i];
            total_time+=temp_time;
        }

        System.out.println(total_time);

    }
}
