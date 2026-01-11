import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pay = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            arr[i][0] = pay;
            arr[i][1] = day;
        }

        Arrays.sort(arr, (o1, o2) -> o1[1] - o2[1]);

        for (int i = 0; i < N; i++) {
            int pay = arr[i][0];
            int day = arr[i][1];

            pq.add(pay);

            if (pq.size() > day) {
                pq.poll();
            }
        }

        int result = 0;
        while (!pq.isEmpty()) {
            result += pq.poll();
        }

        System.out.println(result);
    }
}