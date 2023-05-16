package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A13305 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int sum = 0;
//        int n = Integer.parseInt(br.readLine());
//        int [] distanceArr = new int[n-1];
//        int [] priceArr = new int[n];
//        String distance = br.readLine();
//        String price = br.readLine();
//
//        String[] distances = distance.split(" ");
//        String[] prices = price.split(" ");
//
//        for (int i=0; i<distances.length; i++){
//            distanceArr[i] = Integer.parseInt(distances[i]);
//        }
//
//        for (int i=0; i<prices.length; i++){
//            priceArr[i] = Integer.parseInt(prices[i]);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        long[] distance = new long[N - 1];
        long[] cost = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N - 1; i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long min_cost = cost[0];


        for (int i=0; i<N-1; i++){
            if(min_cost>cost[i]){
                min_cost = cost[i];
            }
            sum += min_cost*distance[i];
        }

        System.out.println(sum);

    }
}
