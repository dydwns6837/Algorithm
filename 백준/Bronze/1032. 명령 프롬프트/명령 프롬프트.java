import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
        // 백준 1032 명령 프롬프트
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
        StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		for(int i = 0; i < arr[0].length(); i++) {
            int count = 0;
			for(int j = 1; j < n; j++) {
				if(arr[0].charAt(i) != arr[j].charAt(i)) {
					count++;
                    break;
				}
			}
			if (count > 0) {
                sb.append("?");
            } else {
                sb.append(arr[0].charAt(i));
            }
		}
        System.out.print(sb);
	}

}