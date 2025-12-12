import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1018 체스판 다시 칠하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[][] arr = new String [n][m];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			String[] str = st.nextToken().split("");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str[j];
			}
		}
		String[] answerB = {"B","W","B","W","B","W","B","W"};
		String[] answerW = {"W","B","W","B","W","B","W","B"};
		int minCount = 32;
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int count = 0;
				int cntfirstB = 0;
				int cntfirstW = 0;
				for (int k = i; k < i + 8; k++) {
					int idx = 0;
					for (int l = j; l < j + 8; l++) {					
						if (k % 2 == 0) {
							if (!answerB[idx].equals(arr[k][l])) {
								cntfirstB++;
							}
							if (!answerW[idx].equals(arr[k][l])) {
								cntfirstW++;
							} 
						} else {
							if (!answerB[idx].equals(arr[k][l])) {
								cntfirstW++;
							}
							if (!answerW[idx].equals(arr[k][l])) {
								cntfirstB++;
							}
						}
						idx++;
					}
					
				}
				count = Math.min(cntfirstB, cntfirstW);
				if (minCount > count) {
					minCount = count;
				}
			}
		} System.out.println(minCount);
		

	}

}
