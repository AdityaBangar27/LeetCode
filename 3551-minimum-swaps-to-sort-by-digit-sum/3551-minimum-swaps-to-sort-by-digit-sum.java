import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            int num = nums[i], sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[i][0] = nums[i];
            arr[i][1] = sum;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1])
                return a[1] - b[1];
            return a[0] - b[0];
        });

        int[] target = new int[n];

        for (int i = 0; i < n; i++)
            target[i] = arr[i][0];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
            map.put(nums[i], i);

        int[] visited = new int[n];

        for (int i = 0; i < n; i++)
            visited[i] = -1;

        for (int i = 0; i < n; i++)
            visited[map.get(target[i])] = i;

        int swaps = 0;
        Arrays.fill(visited, 0);

        for (int i = 0; i < n; i++) {
            if (visited[i] == 1 || map.get(target[i]) == i)
                continue;

            int j = i, cycle = 0;

            while (visited[j] == 0) {
                visited[j] = 1;
                j = map.get(target[j]);
                cycle++;
            }

            if (cycle > 1)
                swaps += cycle - 1;
        }

        return swaps;
    }
}