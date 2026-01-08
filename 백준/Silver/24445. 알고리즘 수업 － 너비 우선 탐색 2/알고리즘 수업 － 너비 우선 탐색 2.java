import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static List<Integer>[] arr;
	static boolean[] visited;
	static int[] order;
	static int idx;
	public static void main(String[] args) throws IOException {
		// 백준 24445 알고리즘 수업 - 너비 우선 탐색2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		visited = new boolean[n + 1];
		order = new int [n + 1];
		
		for (int i = 1; i < arr.length; i++) {
			Collections.sort(arr[i], (o1, o2) -> o2 - o1);;
		}
		
		idx = 1;
		visited[r] = true;
		order[r] = idx++;
		bfs(r);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < order.length; i++) {
			sb.append(order[i]).append("\n");
		}
		System.out.println(sb);
	}
	private static void bfs(int r) {
		Deque<Integer> deq = new ArrayDeque<>();
		deq.add(r);
		while (!deq.isEmpty()) {
			int parent = deq.poll();
			for (int i : arr[parent]) {
				if (!visited[i]) {
					visited[i] = true;
					order[i] = idx++;
					deq.add(i);
				}
			}
		}
	}

}