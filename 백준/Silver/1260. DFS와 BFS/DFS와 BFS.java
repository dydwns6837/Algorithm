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
	
	static List<Integer>[]arr;
	static boolean[] visited;
	static int[] order;
	static int idx = 1;
	
	public static void main(String[] args) throws IOException {
		// 백준 1260 DFS와 BFS
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b); 
			arr[b].add(a); 
		}
		
		for (int i = 1; i < arr.length; i++) {
			Collections.sort(arr[i]);
		}
		
		visited = new boolean[n + 1];
		order = new int[n + 1];
		dfs(v);
		for (int i = 1; i < order.length; i++) {
			if (order[i] == 0) {
				continue;
			}
			System.out.print(order[i] + " ");
		}
		System.out.println();
		visited = new boolean[n + 1];
		order = new int[n + 1];
		idx = 1;
		bfs(v);
		for (int i = 1; i < order.length; i++) {
			if (order[i] != 0) {
				System.out.print(order[i] + " ");
			}
			
		}
	}

	private static void bfs(int v) {
		Deque<Integer> deq = new ArrayDeque<>();
		deq.add(v);
		order[1] = v;
		visited[v] = true;
		while (!deq.isEmpty()) {
			int parent = deq.pollFirst();
			for (int i : arr[parent]) {
				if (!visited[i]) {
					deq.add(i);
					order[++idx] = i;
					visited[i] = true;
				}
			}
		}
		
	}

	private static void dfs(int v) {
		visited[v] = true;
		order[idx++] = v; 
		
		for (int i : arr[v]) {
			if (!visited[i]) {
				dfs(i);
			}
		}
	}
}
