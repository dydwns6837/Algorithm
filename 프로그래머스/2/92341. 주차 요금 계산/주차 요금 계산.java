import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        String[] carN = new String [3];
        String[] hM = new String[2];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < records.length; i++) {
            carN = records[i].split(" ");
            set.add(carN[1]);
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        answer = new int [list.size()];
        
        String h = "";
        String m = "";
        for (int i = 0; i < list.size(); i++) {
            int cnt = 0;
            boolean check = false;
            for (int j = 0; j < records.length; j++) {
                carN = records[j].split(" ");
                if (carN[1].equals(list.get(i)) 
                    && carN[2].equals("IN")) {
                    hM = carN[0].split(":");
                    h = hM[0];
                    m = hM[1];
                    check = true;
                    cnt -= Integer.parseInt(h) * 60 + Integer.parseInt(m);
                } else if (carN[1].equals(list.get(i)) 
                           && carN[2].equals("OUT")) {
                    hM = carN[0].split(":");
                    h = hM[0];
                    m = hM[1];
                    check = false;
                    cnt += Integer.parseInt(h) * 60 + Integer.parseInt(m);
                }
            }
            if (check) {
                cnt += 23 * 60 + 59;
            }
            if (cnt > fees[0]) {
                cnt -= fees[0];
                answer[i] += fees[1];
                if (cnt % fees[2] == 0) {
                    answer[i] += (cnt / fees[2]) * fees[3];
                } else {
                    answer[i] += ((cnt / fees[2]) + 1) * fees[3];
                }
            } else {
                answer[i] = fees[1];
            }
        }
        return answer;
    }
}