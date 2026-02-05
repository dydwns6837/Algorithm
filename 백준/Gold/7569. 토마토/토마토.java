import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static int[][][] tomato;
	static int n;
	static int m;
	static int h;
	static int[] dx = {-1, 1, 0, 0, 0, 0};
	static int[] dy = {0, 0, -1, 1, 0, 0};
	static int[] dz = {0, 0, 0, 0, -1, 1};
	public static void main(String[] args) throws IOException {
		//백준 7569 토마토
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		tomato = new int [h][m][n];
		Deque<int []> deq = new ArrayDeque<>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < n; k++) {
					tomato[i][j][k] = Integer.parseInt(st.nextToken());
					if (tomato[i][j][k] == 1) {
						deq.add(new int[] {i, j, k, 0});
					}
				}
			}
		}
		
		int answer = bfs(deq);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					if (tomato[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		System.out.println(answer);
		
	}
	private static int bfs(Deque<int[]> deq) {
		int day = 0;
		while (!deq.isEmpty()) {
			int [] parent = deq.pollFirst();
			for (int i = 0; i < dx.length; i++) {
				int nz = parent[0] + dx[i];
				int ny = parent[1] + dy[i];
				int nx = parent[2] + dz[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && nz >= 0 && nz < h) {
					if (tomato[nz][ny][nx] == 0) {
						tomato[nz][ny][nx] = 1;
						deq.add(new int [] {nz, ny, nx, parent[3] + 1});
						day = parent[3] + 1;
					}
				}
			}
		}
		return day;
		
	}
}