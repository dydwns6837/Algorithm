import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 12789 도키도키 간식드리미
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int [n];
		int[] temp = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			temp[i] = i + 1;
		}
		Stack<Integer> stack = new Stack<>();
		int idx = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == idx) {
				idx++;
			} else {
				stack.push(arr[i]);
			}
			while (!stack.isEmpty() && stack.peek() == idx) {
				stack.pop();
				idx++;
			}
		}
		
		
		if (stack.isEmpty()) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}
	}

}