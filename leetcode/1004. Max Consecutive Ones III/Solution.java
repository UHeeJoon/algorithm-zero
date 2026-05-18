class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int zeroCount = 0;
        int max = 0;

        for (int j = 0; j < nums.length; j++) {
            zeroCount += 1 - nums[j];
            while (zeroCount > k) {
                zeroCount -= 1 - nums[i++];
            }
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}
