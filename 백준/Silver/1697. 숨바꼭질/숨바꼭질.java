import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		// 백준 1697 숨바꼭질
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		arr = new int [100001];
		visited = new boolean[100001];
		bfs(n, k);
	}
	private static void bfs(int n, int k) {
		Deque<Integer> deq = new ArrayDeque<>();
		visited[n] = true;
		deq.add(n);
		while (!deq.isEmpty()) {
			int parent = deq.pollFirst();
			if (parent == k) {
				System.out.println(arr[parent]);
				return;
			}
			
			int next1 = parent - 1;
            int next2 = parent + 1;
            int next3 = parent * 2;

            if (next1 >= 0 && next1 <= 100000 && !visited[next1]) {
                visited[next1] = true;
                arr[next1] = arr[parent] + 1;
                deq.add(next1);
            }

            if (next2 >= 0 && next2 <= 100000 && !visited[next2]) {
                visited[next2] = true;
                arr[next2] = arr[parent] + 1;
                deq.add(next2);
            }

            if (next3 >= 0 && next3 <= 100000 && !visited[next3]) {
                visited[next3] = true;
                arr[next3] = arr[parent] + 1;
                deq.add(next3);
            }
		}
		
	}

}