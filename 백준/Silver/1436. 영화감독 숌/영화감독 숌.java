import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//  백준 1436 영화감독 숌
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = Integer.MAX_VALUE;
		String[] arr = new String [n + 1];
		arr[0] = "0";
		for (int i = 1; i < arr.length; i++) {
			for (int j = Integer.parseInt(arr[i - 1]) + 1; j < max; j++) {
				if (Integer.toString(j).contains("666")) {
					arr[i] = Integer.toString(j);
					break;
				}
			}
		}
		System.out.println(arr[n]);
	
	}

}