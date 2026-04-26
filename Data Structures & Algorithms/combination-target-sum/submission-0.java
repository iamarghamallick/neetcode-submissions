class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0, nums, target, list, ans);
        return ans;
    }

    private void solve(int i, int[] nums, int target, List<Integer> list, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList(list));
            return;
        }

        if(target < 0 || i == nums.length) {
            return;
        }

        list.add(nums[i]);
        solve(i, nums, target - nums[i], list, ans);
        list.remove(list.size()-1);

        solve(i+1, nums, target, list, ans);
    }
}
