import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int k;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        // 백준 18429 근손실
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int [n + 1];
        result = new int [n];
        visited = new boolean [n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        count = 0;
        dfs(0);
        System.out.println(count);
    }

    private static void dfs(int depth) {
        if (depth == n) {
            int sum = 0;
            for (int num : result) {
                sum += num - k;
                if (sum < 0) {
                    return;
                }
            }
            count++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
