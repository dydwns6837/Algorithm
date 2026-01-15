import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer>[]arr;
	static boolean[] visited;
	static int[] order;
	public static void main(String[] args) throws IOException {
		// 백준 11725 트리의 부모 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		
		visited = new boolean[n + 1];
		order = new int [n + 1];
		bfs(1);
		for (int i = 2; i < order.length; i++) {
			System.out.println(order[i]);
		}
	}

	private static void bfs(int r) {
		Deque<Integer> deq = new ArrayDeque<>();
		visited[r] = true;
		deq.add(r);
		while (!deq.isEmpty()) {
			int parent = deq.pollFirst();
			for (int i : arr[parent]) {
				if (!visited[i]) {
					visited[i] = true;
					order[i] = parent;
					deq.add(i);
				}
			}
		}
		
	}

}