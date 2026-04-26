class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        solve(0, nums, subset, ans);
        return ans;
    }

    private void solve(int i, int[] nums, List<Integer> subset, List<List<Integer>> ans) {
        if(i == nums.length) {
            ans.add(new ArrayList(subset));
            return;
        }

        subset.add(nums[i]);
        solve(i+1, nums, subset, ans);
        subset.remove(subset.size()-1);

        solve(i+1, nums, subset, ans);
    }
}
