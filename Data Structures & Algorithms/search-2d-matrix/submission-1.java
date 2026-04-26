class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ans = Collections.binarySearch(
            Arrays.stream(matrix)
            .flatMapToInt(Arrays::stream)
            .boxed()
            .toList(), target);

        return ans >= 0;
    }
}
