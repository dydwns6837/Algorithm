import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int room = 0; // 몇번째 방인지
		int size = 0;  // 방의 크기
		int minus = 1;
		while (minus > 0) {
			room += 1;
			size += room;
			minus = x - size;
		}
		int right = 0;
		int left = 0;
		if (room % 2 == 0) {
			right = 1 - minus;
			left = room + minus;
		} else {
			right = room + minus;
			left = 1 - minus;
		}
		System.out.println(left + "/" + right);
	}

}