package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A25501 {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
//        System.out.println("ABBA: " + isPalindrome("ABBA") + cnt);
//        cnt = 0;
//        System.out.println("ABCA: " + isPalindrome("ABCA") + cnt);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i =0 ; i<N; i++){
            String a = br.readLine();
            System.out.println(isPalindrome(a) +" "+cnt);
            cnt = 0;
        }

    }

    public static int recursion(String s, int l, int r){
        cnt ++;

        if(l >= r){
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)){
            return 0;
        }
        else{
            return recursion(s, l+1, r-1);
        }
    }

    public static int isPalindrome(String s ){
        return recursion(s, 0, s.length()-1);
    }


}
