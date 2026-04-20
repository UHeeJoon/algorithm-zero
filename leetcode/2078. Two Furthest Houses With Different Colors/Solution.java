class Solution {
    public int maxDistance(int[] colors) {
        int left = 0;
        int max = 0;
        while (left < colors.length) {
            int right = colors.length - 1;
            int leftColor = colors[left];
            while (left < right) {
                if (leftColor != colors[right]) {break;}
                right--;
            }
            max = Math.max(right - left, max);

            while(left < colors.length && leftColor == colors[left]) {left++;}
        }
        return max;
    }
}
