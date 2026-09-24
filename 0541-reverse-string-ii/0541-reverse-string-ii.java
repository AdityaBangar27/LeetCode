class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer sb = new StringBuffer(s);

        for (int start = 0; start < s.length(); start += 2 * k) {
            int left = start;
            int right = Math.min(start + k - 1, s.length() - 1);

            while (left < right) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }
        }

        return sb.toString();
    }
}
