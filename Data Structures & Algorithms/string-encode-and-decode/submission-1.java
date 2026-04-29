class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for(String str: strs) {
            s += Integer.toString(str.length()) + "#" + str;
        }
        System.out.println(s);
        return s; // 5#Hello5#World
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int len = 0;
            while(str.charAt(i) != '#') {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++; // skip '#'
            String temp = str.substring(i, i + len);
            ans.add(temp);
            i += len;
        }
        return ans;
    }
}
