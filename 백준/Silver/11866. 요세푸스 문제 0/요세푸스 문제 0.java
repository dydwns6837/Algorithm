import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 요세푸스 문제 0
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (list.size() > 0) {
			idx = (idx + k - 1) % list.size();
			if (list.size() == 1) {
				sb.append(list.remove(idx) + ">");
			} else {
				sb.append(list.remove(idx) + ", ");
			}
		}
		System.out.println(sb);
	}

}