import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] chess;
	static boolean visited[][];
	static int[] dx = {-2, -2, 2, 2, -1, -1, 1, 1};
	static int[] dy = {-1, 1, -1, 1, -2, 2, -2, 2};
	public static void main(String[] args) throws IOException {
		// 백준 7562 나이트의 이동
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int l = Integer.parseInt(br.readLine());
			chess = new int [l][l];
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			visited = new boolean [l][l];
			bfs(start, end);
			st = new StringTokenizer(br.readLine());
			int targetS = Integer.parseInt(st.nextToken());
			int targetE = Integer.parseInt(st.nextToken());
			sb.append(chess[targetS][targetE]).append("\n");
		}
		System.out.println(sb);

	}
	private static void bfs(int i, int j) {
		Deque<int[]> deq = new ArrayDeque<>();
		visited[i][j] = true;
		deq.add(new int[] {i, j, chess[i][j]});
		while (!deq.isEmpty()) {
			int[] parent = deq.pollFirst();
			for (int x = 0; x < dx.length; x++) {
				int ni = parent[0] + dx[x];
				int nj = parent[1] + dy[x];
				if (ni >= 0 && ni < chess.length && nj >= 0 && nj < chess.length) {
					if (!visited[ni][nj]) {
						visited[ni][nj] = true;
						chess[ni][nj] = parent[2] + 1;
						deq.add(new int[] {ni, nj, chess[ni][nj]});
					}
				}
			}
			
		}
		
	}

}