import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int check = Integer.parseInt(st.nextToken());
			int key = Integer.parseInt(st.nextToken());
			if (check == 1) {
				int value = Integer.parseInt(st.nextToken());
				map.put(key, value);
			} else if (check == 2) {
				int value = Integer.parseInt(st.nextToken());
				if (map.containsKey(key)) {
					map.put(key, value);
				} else if (map.lowerKey(key) != null && K >= key - map.lowerKey(key)
						&& map.higherKey(key) != null && K >= map.higherKey(key) - key) {
					if (key - map.lowerKey(key) < map.higherKey(key) - key) {
						map.put(map.lowerKey(key), value);
					} else if (key - map.lowerKey(key) > map.higherKey(key) - key) {
						map.put(map.higherKey(key), value);
					}
				} else if (map.lowerKey(key) != null 
				         && K >= key - map.lowerKey(key)
				         && !(map.higherKey(key) != null && K >= map.higherKey(key) - key)) {
				    map.put(map.lowerKey(key), value);
				} else if (map.higherKey(key) != null 
				         && K >= map.higherKey(key) - key
				         && !(map.lowerKey(key) != null && K >= key - map.lowerKey(key))) {
				    map.put(map.higherKey(key), value);
				} else {
					continue;
				}
			} else if (check == 3) {
				if (map.containsKey(key)) {
					System.out.println(map.get(key));
				} else if (map.lowerKey(key) != null && map.higherKey(key) != null
                    && K >= map.higherKey(key) - key && K >= key - map.lowerKey(key)
                    && key - map.lowerKey(key) == map.higherKey(key) - key) {
                    System.out.println("?");

                } else if (map.lowerKey(key) != null && map.higherKey(key) != null
                    && K >= key - map.lowerKey(key) && K >= map.higherKey(key) - key) {

                    if (key - map.lowerKey(key) < map.higherKey(key) - key) {
                        System.out.println(map.get(map.lowerKey(key)));
                    } else {
                        System.out.println(map.get(map.higherKey(key)));
                    }
                } else if (map.lowerKey(key) != null && K >= key - map.lowerKey(key)) {
                    System.out.println(map.get(map.lowerKey(key)));
                } else if (map.higherKey(key) != null && K >= map.higherKey(key) - key) {
                    System.out.println(map.get(map.higherKey(key)));
                } else {
                    System.out.println(-1);
                }
		    }
		}
	}

}
