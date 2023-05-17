package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A24060 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split(" ");
        int p = Integer.parseInt(inputs[0]); // start
        int r = Integer.parseInt(inputs[1]); // end

        String[] inputt = br.readLine().split(" ");
        int[] arr = new int[inputt.length];

        for (int i = 0; i < inputt.length; i++) {
            arr[i] = Integer.parseInt(inputt[i]);
        }

        merge_sort(arr, p, r);
    }

    static void merge_sort(int A[], int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

     static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        int[] tmp = new int[r - p + 1];

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while (i <= q) {
            tmp[t++] = A[i++];
        }
        while (j <= r) {
            tmp[t++] = A[j++];
        }
        i = p;
        t = 0;
        while (i <= r) {
            A[i++] = tmp[t++];
        }
    }
}
