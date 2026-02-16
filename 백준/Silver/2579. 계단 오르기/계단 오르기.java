import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 백준 2579 계단 오르기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        int[] score = new int[n + 1];
        for (int i = 1; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = score[1];
        if (n >= 2) {
            dp[2] = score[1] + score[2];
        }
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
        }
        System.out.println(dp[n]);
    }
}

