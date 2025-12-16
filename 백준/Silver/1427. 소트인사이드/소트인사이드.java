import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1427 소트인사이드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split("");
		Arrays.sort(arr, (o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}

}