import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 9063 대지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int [n][2];
		StringTokenizer st;
		int maxW = -10000;
		int maxH = -10000;
		int minW = 10000;
		int minH = 10000;
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			if (arr[i][0] > maxW) {
				maxW = arr[i][0];
			}
			if (arr[i][1] > maxH) {
				maxH = arr[i][1];
			}
			if (arr[i][0] < minW) {
				minW = arr[i][0];
			}
			if (arr[i][1] < minH) {
				minH = arr[i][1];
			}
		}
		System.out.println((maxW - minW) * (maxH - minH));
		
	}

}
