import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    static int[] dx = {1, 2, 3};
    public static void main(String[] args) throws IOException {
        // 백준 9095 1,2,3 더하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(bfs(n)).append("\n");
        }
        System.out.println(sb);
    }

    private static int bfs(int n) {
        int cnt = 0;
        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(0);
        while (!deq.isEmpty()) {
            int parent = deq.poll();
            for (int i = 0; i < dx.length; i++) {
                int nx = parent + dx[i];
                if (nx > 0 && nx <= n) {
                    if (nx == n) {
                        cnt++;
                    } else {
                        deq.add(nx);
                    }
                }
            }
        }
        return cnt;
    }
}
