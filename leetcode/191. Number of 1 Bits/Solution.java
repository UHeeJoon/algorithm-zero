class Solution {
    // public int hammingWeight(int n) {
    //     int count = 0;
    //     while (n > 0) {
    //         n -= (n & -n);
    //         count++;
    //     }
    //     return count;
    // }
    public int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        } else if(n <= 2) {
            return 1;
        }
        return 1 + hammingWeight(n - (n & -n));
    }
}
