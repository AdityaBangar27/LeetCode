class Solution {
public:
    vector<long long> resultArray(vector<int>& nums, int k) {
        vector<long long> ans(k, 0), dp(k, 0);

        for (int num : nums) {
            vector<long long> ndp(k, 0);
            int r = num % k;

            ndp[r]++;

            for (int i = 0; i < k; i++) {
                ndp[(i * r) % k] += dp[i];
            }

            for (int i = 0; i < k; i++) {
                ans[i] += ndp[i];
            }

            dp = ndp;
        }

        return ans;
    }
};