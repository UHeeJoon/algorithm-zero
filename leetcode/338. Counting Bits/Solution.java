class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int oneCount = 0;
            int current = i;
            while (current > 0) {
                oneCount += current & 1;
                current >>= 1; 
            }
            result[i] = oneCount;
        }
        return result;
    }
}
