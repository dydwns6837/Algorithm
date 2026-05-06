import java.util.*;
class Solution {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static boolean[][] visited;
    static int m;
    static int n;
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        visited[0][0] = true;
        answer = bfs(0, 0, 1, maps);
        return answer;
    }
    
    public int bfs(int x, int y, int z, int[][] maps) {
        Deque<int []> deq = new ArrayDeque<>();
        deq.add(new int[] {x, y, z});
        while (!deq.isEmpty()) {
            int[] parent = deq.poll();
            if (parent[0] == n - 1 && parent[1] == m - 1) {
                return parent[2];
            }
            for (int i = 0; i < dx.length; i++) {
                int nx = parent[0] + dx[i];
                int ny = parent[1] + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        deq.add(new int[] {nx, ny, parent[2] + 1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}