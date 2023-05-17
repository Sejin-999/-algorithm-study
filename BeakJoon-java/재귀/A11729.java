package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class A11729 {
    //시간초과
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        System.out.println((int) (Math.pow(2,n)-1));
//        hanoi(n,1,2,3);
//
//    }
//
//    public static void hanoi(int n , int first , int second ,int thr){
//        if(n == 1){
//            System.out.println(first +" "+thr);
//            return;
//        }
//
//        hanoi(n-1 , first , thr , second); // n-1 . A->B
//        System.out.println(first +" "+thr);
//        hanoi(n-1 , second , first , thr); // n-1 . B->C
//    }
    private static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int moves = (int) Math.pow(2, n) - 1;
        output.append(moves).append('\n');
        hanoi(n, 1, 2, 3);

        System.out.print(output);
    }

    public static void hanoi(int n, int first, int second, int third) {
        if (n == 1) {
            output.append(first).append(' ').append(third).append('\n');
            return;
        }

        hanoi(n - 1, first, third, second);
        output.append(first).append(' ').append(third).append('\n');
        hanoi(n - 1, second, first, third);
    }
}
