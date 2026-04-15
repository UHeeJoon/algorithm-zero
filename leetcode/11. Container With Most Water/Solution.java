class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];

            int area = Math.min(leftHeight, rightHeight) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
