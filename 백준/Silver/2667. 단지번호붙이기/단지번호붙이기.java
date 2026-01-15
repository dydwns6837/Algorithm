import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;


public class Main {
	
	static int[][] apart;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int cnt;
	static int n;
	static int count;
	public static void main(String[] args) throws IOException {
		// 백준 2667 단지번호붙이기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String str;
		apart = new int [n][n];
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			for (int j = 0; j < n; j++) {
				apart[i][j] = str.charAt(j) - '0';
			}
		}
		visited = new boolean[n][n];
		cnt = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (apart[i][j] == 1 && !visited[i][j]) {					
					count = 1;
					bfs(i, j);
					list.add(count);
					cnt++;
				}
			}
		}
		Collections.sort(list);
		System.out.println(cnt);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	private static void bfs(int i, int j) {
		Deque<int[]> deq = new ArrayDeque<>();
		deq.add(new int[] {i,j});
		visited[i][j] = true;
		while (!deq.isEmpty()) {
			int[] parent = deq.pollFirst();
			for (int x = 0; x < 4; x++) {
				int ni = parent[0] + dx[x];
				int nj = parent[1] + dy[x];
				if (ni < 0 || nj < 0 || ni >= n || nj >= n) {
					continue;
				} else {
					if (!visited[ni][nj] && apart[ni][nj] == 1) {
						visited[ni][nj] = true;
						deq.add(new int [] {ni,nj});
						count++;
					}
				}
			}
			
		}
	}

}