import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][][] dp;
    static boolean[][][] visited;
    public static void main(String[] args) throws IOException {
        // 백준 9184 신나는 함수 실행
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        dp = new int[51][51][51];
        visited = new boolean[51][51][51];
        while (!(str = br.readLine()).equals("-1 -1 -1")) {
            st  = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append("w(" + a + ", " + b + ", " +  c + ") = " + w(a, b, c)).append("\n");
        }
        System.out.println(sb);
    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            dp[0][0][0] = 1;
            return dp[0][0][0];
        }

        if (!visited[a][b][c]) {
            visited[a][b][c] = true;
            if (a > 20 || b > 20 || c > 20) {
                dp[a][b][c] = w(20, 20, 20);
                return dp[a][b][c];
            } else if (a < b && b < c) {
                dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
                return dp[a][b][c];
            } else {
                dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
                return dp[a][b][c];
            }
        } else {
            return dp[a][b][c];
        }
    }
}