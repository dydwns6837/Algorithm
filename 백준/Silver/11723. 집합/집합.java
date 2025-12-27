import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 11723 집합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] strA = str.split(" ");
			switch(strA[0]) {
				case "add" -> set.add(strA[1]); 
				case "remove" -> set.remove(strA[1]);
				case "check" -> {
					if (set.contains(strA[1])) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
				}
				case "toggle" -> {
					if (set.contains(strA[1])) {
						set.remove(strA[1]);
					} else {
						set.add(strA[1]);
					}
				}
				case "all" -> {
					for (int j = 1; j <= 20; j++) {
						set.add(Integer.toString(j));
					}
				}
				case "empty" -> set.removeAll(set);
			}
		}
		System.out.println(sb);

	}

}