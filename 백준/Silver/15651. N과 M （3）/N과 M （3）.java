import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[] arr;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        // 백준 15651 N과 M (3)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        sb = new StringBuilder();
        back(0);
        System.out.println(sb);
    }

    private static void back(int depth) {
        if (depth == m) {
            for (int number : arr) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            back(depth + 1);
        }
    }
}