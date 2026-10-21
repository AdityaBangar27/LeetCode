class Solution {
    public int[] findEvenNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < nums.length; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    if (nums[i] == 0 || nums[k] % 2 != 0) {
                        continue;
                    }

                    int num = nums[i] * 100 + nums[j] * 10 + nums[k];
                    set.add(num);
                }
            }
        }
        int[] ans = new int[set.size()];
        int index = 0;

        for (int num : set) {
            ans[index++] = num;
        }

        Arrays.sort(ans);
        return ans;
    }
}