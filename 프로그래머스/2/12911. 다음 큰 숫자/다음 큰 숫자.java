class Solution {
    public int solution(int n) {
        int answer = n + 1;
        while (answer > 0) {
            if (Integer.bitCount(n) == Integer.bitCount(answer)) {
                break;
            } else {
                answer += 1;
            }
        }
        return answer;
    }
}