package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A1874 {
    public static void main(String[] args) throws IOException {
        int num = 1;
        boolean ispos = true;
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (num <= target) {
                stack.push(num);
                sb.append("+\n");
                num++;
            }

            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                ispos = false;
                break;
            }
        }

        if (!ispos) {
            System.out.println("No");
        }
        else {
            System.out.println(sb.toString());
        }
    }
}
