package 동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A24416 {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fin(n);
        int a = cnt;
        cnt = 0;
        fibonacci(n);
        int b = cnt;
        System.out.println(a + " " + b);
    }

    public static int fin(int n) {

        if (n == 1 || n == 2) {
            cnt++;
            return 1;
        }
        else{
            return (fin(n-1)+fin(n-2));
        }
    }

    public static int fibonacci(int n){
        int [] fibona = new int[n+1];
        fibona[1] = fibona[2] = 1;
        for (int i=3; i<=n; i++){
            cnt++;
            fibona[i] = fibona[i-1] + fibona[i-2];
        }


        return fibona[n];
    }

}
