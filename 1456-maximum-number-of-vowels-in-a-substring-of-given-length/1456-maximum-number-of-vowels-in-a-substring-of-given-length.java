
// class Solution {
//     public int maxVowels(String s, int k) {
//         int start = 0;
//         int count = 0;
//         int maxCount = 0;

//         for (int i = 0; i < k; i++) {
//             if (s.charAt(i) == 'a' ||
//                     s.charAt(i) == 'e' ||
//                     s.charAt(i) == 'i' ||
//                     s.charAt(i) == 'o' ||
//                     s.charAt(i) == 'u') {
//                 count++;
//             }
//         }

//         maxCount = count;

//         for (int end = k; end < s.length(); end++) {
//             if (s.charAt(end) == 'a' ||
//                     s.charAt(end) == 'e' ||
//                     s.charAt(end) == 'i' ||
//                     s.charAt(end) == 'o' ||
//                     s.charAt(end) == 'u') {
//                 count++;
//             }

//             if (s.charAt(end - k) == 'a' ||
//                     s.charAt(end - k) == 'e' ||
//                     s.charAt(end - k) == 'i' ||
//                     s.charAt(end - k) == 'o' ||
//                     s.charAt(end - k) == 'u') {
//                 count--;
//             }

//             maxCount = Math.max(maxCount, count);

//             if (maxCount == k) {
//                 return maxCount;
//             }
//         }

//         return maxCount;
//     }
// }




class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        maxCount = count;

        for (int end = k; end < s.length(); end++) {
            if (isVowel(s.charAt(end))) {
                count++;
            }

            if (isVowel(s.charAt(end - k))) {
                count--;
            }

            maxCount = Math.max(maxCount, count);

            if (maxCount == k) {
                return maxCount;
            }
        }

        return maxCount;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}