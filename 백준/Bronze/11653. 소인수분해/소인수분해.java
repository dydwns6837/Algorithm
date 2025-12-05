import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 2;
		StringBuilder sb = new StringBuilder();
		while (n != 1) {
			while (n % i == 0) {
				sb.append(i).append("\n");
				n /= i;
			}
			i++;
		}
		System.out.println(sb);

	}

}