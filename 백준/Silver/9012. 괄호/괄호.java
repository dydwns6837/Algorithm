import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str;
		for (int i = 0; i < N; i++) {
			Stack<String> stack = new Stack<>();
			str = br.readLine();
			String answer = "";
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					stack.add("(");
				} else if (!stack.isEmpty() && str.charAt(j) == ')') {
					stack.pop();
				} else {
					answer = "no";
				}
			}
			if (!stack.isEmpty() || answer.equals("no")) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

	}

}
