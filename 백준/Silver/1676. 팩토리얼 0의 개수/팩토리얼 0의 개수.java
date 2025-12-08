import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		//백준 1676 팩토리얼 0의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = n / 5;
		answer += n /25;
		answer += n /125;
		
		System.out.println(answer);
	}
}