import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (a, b) -> a[0].compareTo(b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < book_time.length; i++) {
            String[] start = book_time[i][0].split(":");
            String[] end = book_time[i][1].split(":");

            int s = Integer.parseInt(start[0]) * 60 
                      + Integer.parseInt(start[1]);

            int e = Integer.parseInt(end[0]) * 60 
                    + Integer.parseInt(end[1]) 
                    + 10;

            if (!pq.isEmpty() && pq.peek() <= s) {
                pq.poll();
            }

            pq.offer(e);
        }

        return pq.size();
    }
}