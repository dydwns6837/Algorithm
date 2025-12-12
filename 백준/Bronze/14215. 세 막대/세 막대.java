import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 14215 세 막대
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int [3];
		for (int i = 0; i < arr.length; i++) {		
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		if (arr[0] + arr[1] <= arr[2]) {
			arr[2] = arr[1] + arr[0] - 1;
			sb.append(arr[2] + arr[1] + arr[0]);
		} else {
			sb.append(arr[2] + arr[1] + arr[0]);
		}
		System.out.println(sb);
	}

}
