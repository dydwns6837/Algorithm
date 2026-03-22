import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        // 백준 10824 네 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken() + st.nextToken();
        String str2 = st.nextToken() + st.nextToken();
        long number = Long.parseLong(str1) + Long.parseLong(str2);
        System.out.print(number);
    }
}