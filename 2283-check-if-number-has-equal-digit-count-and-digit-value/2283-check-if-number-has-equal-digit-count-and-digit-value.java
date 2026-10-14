// class Solution {
//     public boolean digitCount(String num) {
//         int freq[] = new int[10];

//         for (int i = 0; i < num.length(); i++) {
//             freq[num.charAt(i) - '0']++;
//         }

//         for (int i = 0; i < num.length(); i++) {
//             if (freq[i] != num.charAt(i) - '0') {
//                 return false;
//             }
//         }
//         return true;
//     }
// }



import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';

            if (map.getOrDefault(i, 0) != expected) {
                return false;
            }
        }

        return true;
    }
}
