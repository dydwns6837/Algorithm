import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1269 대칭 차집합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		Set<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		int count = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			if (set.contains(Integer.parseInt(st.nextToken()))) {
				count++;
			}
		}
		count = A + B - (2 * count);
		System.out.println(count);

	}

}