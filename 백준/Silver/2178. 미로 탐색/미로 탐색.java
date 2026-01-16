import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static int [][] maze;
	static boolean[][] visited;
	static int [] dx = {-1, 1, 0, 0};
	static int [] dy = {0, 0, -1, 1};
	static int n;
	static int m;
	static int cnt;
	public static void main(String[] args) throws IOException {
		// 백준 2178 미로탐색
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		maze = new int [n + 1][m + 1];
		String str;
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			for (int j = 0; j < m; j++) {
				maze[i + 1][j + 1] = str.charAt(j) - '0';
			}
		}
		
		visited = new boolean [n + 1][m + 1];
		cnt = 1;
		bfs(1, 1);
		
		System.out.println(cnt);
	}
	private static void bfs(int i, int j) {
		Deque<int[]> deq = new ArrayDeque<>();
		visited[i][j] = true;
		deq.add(new int [] {i, j, cnt});
		while (!deq.isEmpty()) {
			int[] parent = deq.pollFirst();
			if (parent[0] == n && parent[1] == m) {				
				cnt = parent[2];
			}
			for (int x = 0; x < 4; x++) {
				int ni = parent[0] + dx[x];
				int nj = parent[1] + dy[x];
				if (ni < 1 || nj < 1 || ni >= n + 1 || nj >= m + 1) {
					continue;
				} else {
					if (!visited[ni][nj] && maze[ni][nj] == 1) {
						visited[ni][nj] = true;
						deq.add(new int [] {ni, nj, parent[2] + 1});
					}
				}
			}
		}
		
	}

}