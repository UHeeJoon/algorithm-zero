class Solution {
    public int myAtoi(String s) {
        long result = 0L;
        boolean isDisitStart = false;
        boolean neSign = false;

        for (char c : s.toCharArray()) {

            if (c == ' ') {
                
                if (isDisitStart) {
                    break;
                }
                continue;

            } else if (c == '-' || c == '+') {

                if (isDisitStart) {
                    break;
                } else {
                    neSign = (c == '-');
                    isDisitStart = true;
                }

            } else if ('0' <= c && c <= '9') {

                isDisitStart = true;
                result = result * 10 + (c - '0');

                if (neSign && (result > (long) Integer.MAX_VALUE + 1)) {
                    result = (long) Integer.MAX_VALUE + 1;
                } else if(!neSign && (result > Integer.MAX_VALUE)) {
                    result = Integer.MAX_VALUE;
                }
                
            }else {
                break;
            }
        }
        return (int) (result * (neSign ? -1 : 1));
    }
}
