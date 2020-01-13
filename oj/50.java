/**
 * Source : https://leetcode-cn.com/problems/maximum-subarray/
 * Author : Arther-X
 * Date   : 2020-01-13 22:32:45
 */
class Solution {
    /* 
     * Find the contiguous subarray within an array (containing at least one number) 
     * which has the largest sum.
     * 
     * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
     * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
     * 
     * More practice:
     * 
     * If you have figured out the O(n) solution, try coding another solution using 
     * the divide and conquer approach, which is more subtle.
     * 
     *               
     */
    public int maxSubArray(int[] nums) {
        int maxValue = nums[0], length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i-1] >= 0) {
                nums[i] += nums[i-1];
            }
            maxValue = Math.max(nums[i], maxValue);
        }
        return maxValue;
    }
}