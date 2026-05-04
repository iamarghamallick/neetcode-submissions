class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        int minVal = nums[0];
        int maxVal = nums[0];
        for(int num: nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
            set.add(num);
        }
        int ans = 0;
        for(int num: set) {
            int len = 0;

            if(set.contains(num-1)) {
                
            } else {
                len = 1;
                while(set.contains(num + len)) {
                    len++;
                }
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}
