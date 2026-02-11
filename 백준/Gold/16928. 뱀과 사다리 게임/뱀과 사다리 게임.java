import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static int[] game = new int[100];
	static boolean[] visited = new boolean[100];
	static int[] dx = {1, 2, 3, 4, 5, 6};
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		// 백준 16928 뱀과 사다리 게임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		arr = new int[n][2];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < game.length; i++) {
			game[i] = i + 1;
		}
		bfs();
		
	}
	private static void bfs() {
		Deque<int[]> deq = new ArrayDeque<>();
		deq.add(new int[] {1, 0});
		visited[0] = true;
		while (!deq.isEmpty()) {
			int[] parent = deq.pollFirst();
			for (int x = 0; x < dx.length; x++) {
				int ni = parent[0] + dx[x];
				for (int j = 0; j < arr.length; j++) {
					if (ni == arr[j][0]) {
						ni = arr[j][1];
					}
				}
				if (ni == game.length) {
					System.out.println(parent[1] + 1);
					return;
				}
				if (ni > 0 && ni <= game.length) {
					if (!visited[ni - 1]) {
						visited[ni - 1] = true;
						deq.add(new int[] {ni, parent[1] + 1});
					}
				}
			}
		}
	}

}