import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 백준 1158 요세푸스 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Deque<Integer> deq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deq.add(i);
        }
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!deq.isEmpty()) {
            if (count == k) {
                if (deq.size() == 1) {
                    sb.append(deq.poll()).append(">");
                } else {
                    sb.append(deq.poll()).append(", ");
                }
                count = 1;
            } else {
                deq.addLast(deq.poll());
                count++;
            }
        }
        System.out.println(sb);
    }
}
