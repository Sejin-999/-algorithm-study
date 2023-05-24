package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class A1260 {
    static int n; //정점의 수
    static int m; //간선의수
    static int v; //시작점
    static int[][] branch; //간선연결
    static boolean[] checked; // 확인여부

    public static void dfs(int start){
        checked[start] = true;
        System.out.print(start + " ");

        for(int i=1; i<=n; i++){
            if(branch[start][i] == 1 && checked[i] != true){
                dfs(i);
            }
        }

    }

    public static void bfs(){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(v);
        checked[v] = true;
        System.out.print(v + " ");

        while (!queue.isEmpty()){
            int temp = queue.poll();

            for (int i=1; i<=n; i++){
                if(branch[temp][i] == 1 && checked[i] != true ){
                    queue.offer(i);
                    checked[i]= true;
                    System.out.print(i + " ");
                }
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String [] inputs = input.split(" ");
        n = Integer.parseInt(inputs[0]);
        m = Integer.parseInt(inputs[1]);
        v = Integer.parseInt(inputs[2]);

        branch = new int[1001][1001];
        checked = new boolean[1001];
        for (int i=0; i<m; i++){
            String input2 = br.readLine();
            String [] inputs2 = input2.split(" ");
            int x = Integer.parseInt(inputs2[0]);
            int y = Integer.parseInt(inputs2[1]);

            branch[x][y] = branch[y][x] = 1;
        }

        dfs(v);
        checked = new boolean[1001];
        System.out.println();
        bfs();


    }
}


//        for(int i=0; i<m; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(branch[i][j]);
//            }
//            System.out.println();
//        }