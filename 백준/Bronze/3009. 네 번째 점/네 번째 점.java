import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 3009 네 번째 점
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] arr = new int [3][2];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		StringBuilder sb = new StringBuilder();
		if (arr[0][0] - arr[1][0] == 0) {
			sb.append(arr[2][0]).append(" ");
		} else if (arr[1][0] - arr[2][0] == 0) {
			sb.append(arr[0][0]).append(" ");
		} else if (arr[0][0] - arr[2][0] == 0) {
			sb.append(arr[1][0]).append(" ");
		}
		if (arr[0][1] - arr[1][1] == 0) {
			sb.append(arr[2][1]);
		} else if (arr[1][1] - arr[2][1] == 0) {
			sb.append(arr[0][1]);
		} else if (arr[0][1] - arr[2][1] == 0) {
			sb.append(arr[1][1]);
		}
		System.out.println(sb);
	}

}
