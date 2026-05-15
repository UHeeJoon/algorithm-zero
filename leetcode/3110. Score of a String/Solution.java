class Solution {
    public int scoreOfString(String s) {
        return IntStream.range(0, s.length() - 1)
                .map(index -> Math.abs(s.charAt(index) - s.charAt(index + 1)))
                .sum();
    }
}
