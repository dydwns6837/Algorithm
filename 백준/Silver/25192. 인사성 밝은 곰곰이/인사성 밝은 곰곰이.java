import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	// 백준 25192 인사성 밝은 곰곰이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                set.clear();
            } else {
                if (!set.contains(str)) {                	
                	set.add(str);
                	count++;
                }
            }
        }
        System.out.println(count);
    }
}