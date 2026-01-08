import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static List<Integer>[] arr;
	static boolean[] visited;
	static int cnt;
	public static void main(String[] args) throws IOException {
		// 백준 2606 바이러스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		arr = new ArrayList[n + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		visited = new boolean[n + 1];
		cnt = 0;
		bfs(1);
		System.out.println(cnt);
	}
	
	private static void bfs(int r) {
		Deque<Integer> deq = new ArrayDeque<>();
		visited[r] = true;
		deq.add(r);
		while (!deq.isEmpty()) {
			int parent = deq.poll();
			for (int i : arr[parent]) {
				if (!visited[i]) {
					visited[i] = true;
					cnt++;
					deq.add(i);
				}
			}
		}
	}

}
