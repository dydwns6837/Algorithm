import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 7785 회사에 있는 사람
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new TreeMap<>(Collections.reverseOrder());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		for (String keys:map.keySet()) {
			if (map.get(keys).equals("enter")) {
				sb.append(keys).append("\n");
			}
		}
		System.out.println(sb);

	}

}