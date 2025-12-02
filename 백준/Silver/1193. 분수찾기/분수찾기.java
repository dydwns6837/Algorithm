import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int room = 0; // 몇번째 방인지
		while (x > 0) {
			room += 1;
			x -= room;
		}
		int right = 0;
		int left = 0;
		if (room % 2 == 0) {
			right = 1 - x;
			left = room + x;
		} else {
			right = room + x;
			left = 1 - x;
		}
		sb.append(left).append("/").append(right);
		System.out.println(sb);
	}

}