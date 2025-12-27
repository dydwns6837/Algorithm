import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 백준 18110 solved.ac
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int start = (int)Math.round(arr.length * 0.15);
		int end = arr.length - start;
		double sum = 0;
		for (int i = start; i < end; i++) {
			sum += arr[i];
		}
		int avg = (int)Math.round(sum / (end - start));
		System.out.println(avg);
	}
}