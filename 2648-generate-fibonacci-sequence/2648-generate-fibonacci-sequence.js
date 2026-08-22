var fibGenerator = function* () {
    let a = 0;
    let b = 1;

    while (true) {
        yield a;
        let temp = a;
        a = b;
        b = temp + b;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */

//  class Solution {
//     public int[] generateFibonacci(int n) {
//         int[] ans = new int[n];

//         if (n > 0) ans[0] = 0;
//         if (n > 1) ans[1] = 1;

//         for (int i = 2; i < n; i++) {
//             ans[i] = ans[i - 1] + ans[i - 2];
//         }

//         return ans;
//     }
// }