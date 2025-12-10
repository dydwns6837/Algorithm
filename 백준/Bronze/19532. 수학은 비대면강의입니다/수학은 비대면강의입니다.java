import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 19532 수학은 비대면강의입니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int a1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for (int i = -999; i <= 999; i++) {
			for (int j = - 999; j <= 999; j++) {
				if (((x1 + x2) * i) + ((y1 + y2) * j) == (a1 + a2)) {
					if ((x1 * i) + (y1 * j) == a1) {
						if ((x2 * i) + (y2 * j) == a2) {
							sb.append(i).append(" ").append(j);
						}
					}
				}
			}
		}System.out.println(sb);
	}

}