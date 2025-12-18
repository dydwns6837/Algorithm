import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 18870 좌표 압축
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int [n];
		int[] arr2 = new int [n];
		int[] arr3 = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr[i];
			arr3[i] = arr[i];			
		}
		Arrays.sort(arr2);
		int max = arr2[0];
		arr2[0] = 0;
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] == max) {
				arr2[i] = arr2[i - 1];
			} else if (arr2[i] > max) {
				max = arr2[i];
				arr2[i] = arr2[i - 1] + 1;
			}
		}
		Arrays.sort(arr3);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {
			if (!map.containsKey(arr3[i])) {
				map.put(arr3[i], arr2[i]);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(map.get(arr[i]) + " ");
		}
		System.out.println(sb);
	}

}