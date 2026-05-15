import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long max = (long)times[times.length - 1] * n;
        long min = 1;
        while (min <= max) {
            long mid = (max + min) / 2;
            long cnt = 0;
            for (int i = 0; i < times.length; i++) {
                cnt += mid / times[i];
            }
            if (cnt >= n) {
                max = mid - 1;
                answer = mid;
            } else {
                min = mid + 1;
            }
        }
        
        return answer;
    }
}