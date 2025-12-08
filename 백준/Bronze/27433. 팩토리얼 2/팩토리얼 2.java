import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 27433 팩토리얼 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fact(n));
	}

	private static long fact(int n) {
		if (n > 1) {
			return n * fact(n - 1);
		} else {
			return 1;
		}
	}

}
