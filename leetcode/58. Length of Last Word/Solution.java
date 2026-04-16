class Solution {
    public int lengthOfLastWord(String s) {
        int startIndex = s.length() - 1;
        boolean rpad = false;
        int rpadCount = 0;
        for (; startIndex >= 0; startIndex--) {
            if (!rpad && s.charAt(startIndex) == ' ') {
                rpadCount++;
            } else if(s.charAt(startIndex) != ' ') {
                rpad = true;
            } else if(rpad && s.charAt(startIndex) == ' ') {
                break;
            }
        }
        return s.length() - 1 - startIndex - rpadCount;
    }
}
