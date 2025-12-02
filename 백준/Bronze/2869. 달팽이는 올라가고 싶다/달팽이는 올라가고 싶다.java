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
		int answer = (int)Math.ceil((double)(V - A) / (A - B)) + 1;
		System.out.println(answer);
	}

}