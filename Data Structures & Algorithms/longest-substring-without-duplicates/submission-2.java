class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] c = s.toCharArray();
        int ans = 0;
        int start = 0;
        int end = 0;
        int n = s.length();
        while(start < n && end < n) {
            if(set.contains(c[end])) {
                set.remove(c[start]);
                start++;
            } else {
                set.add(c[end]);
                end++;
                ans = Math.max(ans, end - start);
            }
        }
        return ans;
    }
}
