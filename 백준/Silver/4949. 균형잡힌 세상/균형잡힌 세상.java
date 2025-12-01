import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while (!(str = br.readLine()).equals(".")) {
			Stack<String> stack = new Stack<>();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(') {
					stack.push("(");
				} else if (str.charAt(i) == '[') {
					stack.push("[");
				} else if (str.charAt(i) == ']') {
					if (!stack.isEmpty() && stack.peek().equals("[")) {
						stack.pop();
					} else {
						stack.push("NO");
						break;
					}
				} else if (str.charAt(i) == ')') {
					if (!stack.isEmpty() && stack.peek().equals("(")) {
						stack.pop();
					} else {
						stack.push("NO");
						break;
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

}
