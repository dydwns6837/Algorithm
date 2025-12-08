import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2231 분해합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = n / 2;
		while (n != m) {
			String changM = Integer.toString(m);
			int sum = m;
			String[] arr = changM.split("");
			for (int i = 0; i < arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
			}
			if (n == sum) {
				System.out.println(m);
				break;
			}
			m++;
		}
		if (n == m) {
			System.out.println(0);
		}
	}

}
