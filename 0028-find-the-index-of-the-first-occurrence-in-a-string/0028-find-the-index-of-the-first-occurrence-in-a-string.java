
class Solution {
    public int strStr(String str, String key) {
        for (int i = 0; i <= str.length() - key.length(); i++) {
            int j = 0;

            while (j < key.length() && str.charAt(i + j) == key.charAt(j)) {
                j++;
            }

            if (j == key.length()) {
                return i;
            }
        }

        return -1;
    }
}
