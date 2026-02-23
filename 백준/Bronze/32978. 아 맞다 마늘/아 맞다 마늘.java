import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 백준 32978 아 맞다 마늘
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (set.contains(str)) {
                set.remove(str);
            }
        }
        sb.append(set.iterator().next());
        System.out.println(sb);
    }
}
