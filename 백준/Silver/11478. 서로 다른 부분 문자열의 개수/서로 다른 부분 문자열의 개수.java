import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 11478 서로 다른 부분 문자열의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = 0;
		Set<String> set = new HashSet<>();
		while (len != str.length()) {
			for (int i = 0; i < str.length() - len; i++) {
				set.add(str.substring(i, i + len + 1));
			}
			len++;
		}
		System.out.println(set.size());

	}

}