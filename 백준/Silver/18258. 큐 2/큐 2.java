import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new ArrayDeque<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch(str) {
				case "push" -> {
					deq.offer(Integer.parseInt(st.nextToken()));
				}
				case "pop" -> {
					if (!deq.isEmpty()) {
						sb.append(deq.pollFirst() + "\n");
					} else {
						sb.append(-1 + "\n");
					}
				}
				case "size" -> {
					sb.append(deq.size() + "\n");
				}
				case "empty" -> {
					if (deq.isEmpty()) {
						sb.append(1 + "\n");
					} else {
						sb.append(0 + "\n");
					}
				}
				case "front" -> {
					if (deq.isEmpty()) {
						sb.append(-1 + "\n");
					} else {
						sb.append(deq.peekFirst() + "\n");
					}
				}
				case "back" -> {
					if (deq.isEmpty()) {
						sb.append(-1 + "\n");
					} else {
						sb.append(deq.peekLast() + "\n");
					}
				}
			}
		}
		System.out.println(sb);
	}

}