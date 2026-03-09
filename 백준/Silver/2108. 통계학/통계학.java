import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2108 통계학
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		double sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		Arrays.sort(arr);
		long avg = Math.round(sum / n);
		int max = 0;
		for (int value : map.values()) {
			if (value > max) {
				max = value;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int key : map.keySet()) {
			if (map.get(key) == max) {
				list.add(key);
			}
		}
		Collections.sort(list);
		int maxCnt = 0;
		if (list.size() > 1) {
			maxCnt = list.get(1);
		} else {
			maxCnt = list.get(0);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(avg).append("\n");
		sb.append(arr[n / 2]).append("\n");
		sb.append(maxCnt).append("\n");
		sb.append(arr[arr.length - 1] - arr[0]);
		System.out.println(sb);
	}
}
