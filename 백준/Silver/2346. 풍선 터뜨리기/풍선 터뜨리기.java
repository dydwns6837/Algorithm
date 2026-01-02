import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2346 풍선 터뜨리기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> deq = new ArrayDeque<>();
		int[] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			deq.add(i + 1);
		}
		StringBuilder sb = new StringBuilder();
		int idx = deq.pollFirst();
		sb.append(idx).append(" ");
		int k = arr[idx - 1];
		int count = 0;
		while (!deq.isEmpty()) {
			if (k > 0) {
				count++;
				if (count == k) {
					idx = deq.pollFirst();
					sb.append(idx).append(" ");
					k = arr[idx - 1];
					count = 0;
				} else {
					deq.addLast(deq.pollFirst());
				}
			} else {
				count--;
				if (count == k) {
					idx = deq.pollLast();
					sb.append(idx).append(" ");
					k = arr[idx - 1];
					count = 0;
				} else {
					deq.addFirst(deq.pollLast());
				}
			}
		}
		System.out.println(sb);
	}

}