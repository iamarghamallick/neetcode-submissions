class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }
        for(String s: map.keySet()) {
            ans.add(new ArrayList<>(map.get(s)));
        }
        return ans;
    }
}
