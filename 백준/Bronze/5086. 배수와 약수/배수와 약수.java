import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str;
		while (!(str = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(str);
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			if (n1 < n2 && n2 % n1 == 0) {
				sb.append("factor").append("\n");
			} else if (n1 > n2 && n1 % n2 == 0) {
				sb.append("multiple").append("\n");
			} else {
				sb.append("neither").append("\n");
			}
		}
		System.out.println(sb);
		

	}

}