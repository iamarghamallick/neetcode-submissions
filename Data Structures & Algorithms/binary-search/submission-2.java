class Solution {
    public int search(int[] nums, int target) {
        // int index = Collections.binarySearch(
        //     Arrays.stream(nums)
        //         .boxed()
        //         .toList(),
        // target);

        // return index >= 0 ? index : -1;

        int l = 0;
        int r = nums.length - 1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(nums[m] == target) {
                return m;
            } else if(nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}
