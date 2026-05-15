import java.util.*;
class Solution {
    static boolean[] visited;
    static int answer;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];
        back(k, 0, dungeons);
        return answer;
    }
    
    public void back(int piro, int depth, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && piro >= dungeons[i][0]) {
                visited[i] = true;
                back(piro - dungeons[i][1], depth + 1, dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}