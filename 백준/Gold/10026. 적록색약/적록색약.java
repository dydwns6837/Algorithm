import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] color;
    static char[][] nColor;
    static int n;
    static boolean[][] visited;
    static boolean[][] visited2;
    public static void main(String[] args) throws IOException {
        // 백준 10026 적록색약
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        color = new char [n][n];
        nColor = new char [n][n];
        visited = new boolean[n][n];
        visited2 = new boolean[n][n];
        StringTokenizer st;
        for (int i = 0; i < color.length; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < color[i].length; j++) {
                color[i][j] = str.charAt(j);
                if (color[i][j] == 'G') {
                    nColor[i][j] = 'R';
                } else {
                    nColor[i][j] = color[i][j];
                }
            }
        }

        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < color[i].length; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    bfs(i, j);
                    cnt++;
                }
                if (!visited2[i][j]) {
                    visited2[i][j] = true;
                    bfs2(i, j);
                    cnt2++;
                }
            }
        }
        System.out.println(cnt + " " + cnt2);
    }

    private static void bfs(int i, int j) {
        Deque<int[]> deq = new ArrayDeque<>();
        deq.add(new int[] {i, j});
        while(!deq.isEmpty()) {
            int[] parent = deq.poll();
            for (int x = 0; x < dx.length; x++) {
                int ni = parent[0] + dx[x];
                int nj = parent[1] + dy[x];
                if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                    if (!visited[ni][nj] && color[i][j] == color[ni][nj]) {
                        visited[ni][nj] = true;
                        deq.add(new int[] {ni, nj});
                    }
                }
            }
        }

    }

    private static void bfs2(int o, int p) {
        Deque<int[]> deq2 = new ArrayDeque<>();
        deq2.add(new int[] {o, p});
        while(!deq2.isEmpty()) {
            int[] parent = deq2.poll();
            for (int x = 0; x < dx.length; x++) {
                int ni = parent[0] + dx[x];
                int nj = parent[1] + dy[x];
                if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                    if (!visited2[ni][nj] && nColor[o][p] == nColor[ni][nj]) {
                        visited2[ni][nj] = true;
                        deq2.add(new int[] {ni, nj});
                    }
                }
            }
        }
    }
}
