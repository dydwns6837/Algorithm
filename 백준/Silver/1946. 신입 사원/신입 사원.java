import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1946 신입 사원
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int [n][2];
			for (int i = 0; i < n; i++) {
				st  = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
			int count = 1;
			int max = arr[0][1];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][1] < max) {
					max = arr[i][1];
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

}