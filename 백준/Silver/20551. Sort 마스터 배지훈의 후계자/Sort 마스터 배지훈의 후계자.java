import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		//	백준 20551 Sort 마스터 배지훈의 후계자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int left = 0;
			int right = arr.length - 1;
			int mid = (left + right) / 2;
			int a = Integer.parseInt(br.readLine());
			int answer = -1;
			while (left <= right) {
				if (arr[mid] == a) {
					answer = mid;
					break;
				} else if (arr[mid] < a) {
					left = mid + 1;
					mid = (left + right) / 2;
				} else {
					right = mid - 1;
					mid = (right + left) / 2;
				}
			}
			if (answer != -1) {
				for (int j = answer - 1; j >= 0; j--) {
					if (arr[answer] != arr[j]) {
						answer = j + 1;
						break;
					} else {
						answer = j;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
		
	}

}
