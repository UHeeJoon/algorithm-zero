class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Map<Integer, Integer> orderMap = new HashMap<>();
        for (int i = 1; i <= order.length; i++) {
            orderMap.put(order[i - 1], i);
        }
        return Arrays.stream(friends)
                .boxed()
                .sorted((a, b) -> orderMap.get(a) - orderMap.get(b))
                .mapToInt(i -> i)
                .toArray();
    }
}
