import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		// 백준 4779 칸토어 집합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String str;
		while ((str = br.readLine()) != null) {
			n = Integer.parseInt(str);
			int len = (int)Math.pow(3, n);
			sb = new StringBuilder();
			for (int i = 0; i < len; i++) {
				sb.append("-");
			}
			cantor(0, len);
			System.out.println(sb);
		}
		
	}

	private static void cantor(int start, int len) {
		if (len == 1) {
			return;
		}
		int center = len / 3;
		for (int i = start + center; i < start + 2 * center; i++) {
			sb.setCharAt(i, ' ');
		}
		
		cantor(start, center);
		cantor(start + 2 * center, center);
		
	}
	
}