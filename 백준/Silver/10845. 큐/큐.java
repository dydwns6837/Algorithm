import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 10845 큐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<String> que = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] strA = str.split(" ");
			switch (strA[0]) {
				case "push" -> que.add(strA[1]);
				case "pop" -> {
					if (que.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(que.poll()).append("\n");
					}
				}
				case "size" -> sb.append(que.size()).append("\n");
				case "front" -> {
					if (que.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(que.getFirst()).append("\n");;
					}
				}
				case "back" -> {
					if (que.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(que.peekLast()).append("\n");;
					}
				}
				case "empty" -> {
					if (que.isEmpty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
				}
			}
		}
		System.out.println(sb);
	}

}