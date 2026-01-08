import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 28279 덱2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<String> deq = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] str;
		while (n-- > 0) {
			str = br.readLine().split(" ");
			switch (str[0]) {
				case "1" -> deq.addFirst(str[1]);
				case "2" -> deq.addLast(str[1]);
				case "3" -> {
					if (!deq.isEmpty()) {
						sb.append(deq.pollFirst()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
				}
				case "4" -> {
					if (!deq.isEmpty()) {
						sb.append(deq.pollLast()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
				}
				case "5" -> sb.append(deq.size()).append("\n");
				case "6" -> {
					if (!deq.isEmpty()) {
						sb.append(0).append("\n");
					} else {
						sb.append(1).append("\n");
					}
				}
				case "7" -> {
					if (!deq.isEmpty()) {
						sb.append(deq.peekFirst()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
				}
				case "8" -> {
					if (!deq.isEmpty()) {
						sb.append(deq.peekLast()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
				}
			}
		}
		System.out.println(sb);
	}

}