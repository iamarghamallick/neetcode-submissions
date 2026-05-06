class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int res = 0;
        int max = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
            max = Math.max(hm.get(s.charAt(i)), max);
            int tt = i-l+1 - max;
            if(tt<=k){
                res = Math.max(res,  i-l+1);
            }
            else{
                hm.put(s.charAt(l), hm.get(s.charAt(l))-1);
                if(hm.get(s.charAt(l)) == 0) {
                    hm.remove(s.charAt(l));
                }
                l++;
            }
        }
        return res;
    }
}
