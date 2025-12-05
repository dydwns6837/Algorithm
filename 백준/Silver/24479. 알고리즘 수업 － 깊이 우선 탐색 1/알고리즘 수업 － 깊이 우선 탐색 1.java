import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	static List<Integer>[] arr;
	static int[] order;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(arr[i], Collections.reverseOrder());
		}
		
		dfs(R, N);
		for (int i = 1; i < order.length ; i++) {
			System.out.println(order[i]);
		}
		
	}

	private static void dfs(int R, int N) {
		boolean[] visited = new boolean[N + 1];
		Stack<Integer> stack = new Stack<>();
		order = new int[N + 1];
		stack.push(R);
		
		while (!stack.isEmpty()) {
			int idx = stack.pop();
			if (visited[idx]) {
				continue;
			}
			visited[idx] = true;
			order[idx] = ++cnt;
			
			for (int i : arr[idx]) {
	            if(!visited[i]){
	                stack.push(i);
	            }
	            
	        }
		}
		
	}
}
