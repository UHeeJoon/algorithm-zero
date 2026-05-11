class Solution {
    public int[] separateDigits(int[] nums) {
        return Arrays.stream(nums).flatMap(num -> ("" + num).chars().map(ch -> ch - '0')).toArray();
    }
}
