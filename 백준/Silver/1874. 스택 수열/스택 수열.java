import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1874 스택 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int idx = 1;
		int answer = 0;
		for (int i = 0; i < n; i++) {
			int s = Integer.parseInt(br.readLine());
			for (int j = idx; j <= s; j++) {
				if (!stack.contains(idx)) {
					stack.push(idx);
					sb.append("+").append("\n");
					idx++;
				}
			}
			if (stack.peek() != s) {
				answer++;
			} else {
				stack.pop();
				sb.append("-").append("\n");
			}
		}
		if (answer != 0) {
			System.out.println("NO");
		} else {
			System.out.println(sb);
		}
		
		
	}

}