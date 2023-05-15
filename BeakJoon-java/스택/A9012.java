package 스택;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A9012 {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++ ){
            String input = br.readLine();
            char[] chars = input.toCharArray();
            int openCount = 0;
            int closeCount = 0;

            for (char c : chars){
                if(c == '('){
                    stack.push(c);
                    openCount++;
                }else{
                    if (!stack.isEmpty()){
                        stack.pop();
                        closeCount++;
                    }else{
                        System.out.println("NO");
                        break;
                    }
                }
            }

            if (stack.isEmpty() && openCount == closeCount) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack.clear(); // 스택 초기화
        }
    }
}
