import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int answer = 0;
		if ((V - B) % (A - B) == 0) {
			answer = (V - B) / (A - B);
		} else {
			answer = (V - B) / (A - B) + 1;
		}
		System.out.println(answer);
	}

}