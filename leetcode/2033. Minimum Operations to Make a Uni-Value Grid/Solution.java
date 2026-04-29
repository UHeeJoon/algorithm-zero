class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr = Arrays.stream(grid).flatMapToInt(row -> Arrays.stream(row)).toArray();
        if (x != 1 && !check(arr, x)) {
            return -1;
        }
        Arrays.sort(arr);
        int median = arr[arr.length / 2];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += Math.abs(arr[i] - median) / x;
        }

        return result;
    }

    public boolean check(int[] arr, int x) {
        return Arrays.stream(arr).allMatch(item -> (item % x) == (arr[0] % x));
    }
}
