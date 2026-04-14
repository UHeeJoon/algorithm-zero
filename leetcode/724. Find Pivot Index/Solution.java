class Solution {
    public int pivotIndex(int[] nums) {
        int[] sum = new int[nums.length + 1];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        for (int i = 1; i < sum.length; i++) {
            if (sum[i - 1] == sum[sum.length - 1] - sum[i]) {
                return i - 1;
            }
        }
        return -1;
    }
}
