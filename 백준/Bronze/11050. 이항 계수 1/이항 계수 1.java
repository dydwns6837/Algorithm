import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 11050 이항 계수 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int sum = 1;
		for (int i = 0; i < b; i++) {
			sum *= (a - i);
		}
		for (int i = 0; i < b; i++) {
			sum /= (b - i);
		}
		System.out.println(sum);
	}

}