import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 10828 스택
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] strA = str.split(" ");
			switch (strA[0]) {
				case "push" -> stack.push(strA[1]);
				case "pop" -> {
					if (stack.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(stack.pop()).append("\n");
					}
				}
				case "size" -> sb.append(stack.size()).append("\n");
				case "top" -> {
					if (stack.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(stack.peek()).append("\n");;
					}
				}
				case "empty" -> {
					if (stack.isEmpty()) {
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