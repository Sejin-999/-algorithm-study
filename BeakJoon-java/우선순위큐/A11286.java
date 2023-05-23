package 우선순위큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class A11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq =  new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        //Math.abs -> 절대값을 리턴하는 함수 ..
                        // 처음 if로 앞값이 더 절대값이 크면 교환
                        //두번째는 값이 같다면 음수를 먼저 보낸다.
                        //없으면 -1
                        if(Math.abs(o1) > Math.abs(o2)){
                            return Math.abs(o1) - Math.abs(o2);
                        } else if (Math.abs(o1) == Math.abs(o2)) {
                            return o1 - o2;
                        }else{
                            return -1;
                        }
                    }
                }
        );

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if (pq.isEmpty()){
                    //없는경우
                    System.out.println(0);
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.add(x);
            }
        }


    }
}
