class Solution {
    public int missingNumber(int[] nums) {
        return IntStream.rangeClosed(1, nums.length).sum() 
                - Arrays.stream(nums).sum();
    }
}
