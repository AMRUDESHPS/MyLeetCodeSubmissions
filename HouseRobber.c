/*
 * 198. House Robber
*/

#include <math.h>

int rob(int* nums, int numsSize) {
    int rob1 = 0, rob2 = 0, i, num, max;
    for (int i = 0; i < numsSize; i++) {
        num = nums[i];
        max = fmax(rob1 + num, rob2);
        rob1 = rob2;
        rob2 = max;
    }
    return rob2;
}
