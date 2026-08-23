class Solution {
    public boolean sumGame(String num) {
        
        int n = num.length();
        int mid = n / 2;

        int cnt1 = 0;
        int cnt2 = 0;

        int s1 = 0;
        int s2 = 0;

        // First half
        for (int i = 0; i < mid; i++) {
            char c = num.charAt(i);

            if (c == '?') {
                cnt1++;
            } else {
                s1 += c - '0';
            }
        }

        // Second half
        for (int i = mid; i < n; i++) {
            char c = num.charAt(i);

            if (c == '?') {
                cnt2++;
            } else {
                s2 += c - '0';
            }
        }

        // Odd number of ? -> Alice wins
        if ((cnt1 + cnt2) % 2 == 1) {
            return true;
        }

        // Bob can win only if sums can be balanced
        return s1 - s2 != 9 * (cnt2 - cnt1) / 2;
    }
}