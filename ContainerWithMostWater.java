/*
 * 11. Container With Most Water
*/

class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int res = 0;
        int min;
        
        while (left < right) {
            min = Math.min(height[left], height[right]);
            res = Math.max(res, (right - left) * min);
            
            if (height[left] >= height[right]) {
                right--;
            } else {
                left++;
            }
        }
        
        return res;
    }
}
